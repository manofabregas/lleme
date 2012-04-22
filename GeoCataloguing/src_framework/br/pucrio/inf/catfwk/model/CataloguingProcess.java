/* Generated by Together */

package br.pucrio.inf.catfwk.model;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import br.pucrio.inf.geocat.CustomFactory;
import br.pucrio.inf.lib.agent.Agent;
import br.pucrio.inf.lib.observer.SubjectImpl;
import br.pucrio.inf.lib.util.Utils;

/**
 * @version 1.0
 * @since 1.0
 * @author Luiz Andr�
 * @alias CataloguingProcess*/
public class CataloguingProcess extends SubjectImpl implements Serializable {
	public CataloguingProcess(String name, String[] datasetSites,
			String[][] annotationLocations, String catalogFilename,
			String failsFilename) {
		this.name = name;
		this.repositories = datasetSites;
		this.gazetteers = annotationLocations;
		this.catalog = catalogFilename;
		this.fails = failsFilename;
	}

	/**
	 * @return Returns the utils.
	 */
	private Utils getUtils() {
		if (utils == null)
			utils = new Utils();
		return utils;
	}

	/**
	 * @return Returns the factory.
	 */
	private FrameworkFactory getFactory() {
		if (factory == null)
			factory = new CustomFactory();
		return factory;
	}

	private static final long serialVersionUID = -1339040526288595169L;

	private String name = null;

	transient private String state = "Stoped";

	private String[] repositories = null;

	private String[][] gazetteers = null;

	private String fails = null;

	private String catalog = null;
	transient private Catalog failsCatalog = null;
	transient private FrameworkFactory factory = null;
	transient private Utils utils = null;

	/**
	 * @link aggregation
	 * @associates <{br.pucrio.inf.lib.agent.Agent}>
	 * @supplierCardinality 2..*
	 * @bidirectional <{br.pucrio.inf.lib.agent.Agent#process}>*/
	transient private ArrayList agents = null;

	public void start() throws InvalidDictionaryException,
			InvalidRepositoryException {
		if (agents == null) {
			createAgents();
		}
		for (int i = 0; i < agents.size(); i++) {
			((Agent) agents.get(i)).start();
		}
		state = "Running";
		notifyObservers();
	}

	private void stopAgents() {
		if (agents != null)
			for (int i = 0; i < agents.size(); i++) {
				((Agent) agents.get(i)).stop();
			}
	}

	public void stop() {
		stopAgents();
		state = "Stoped";
		setAgents(null);
		notifyObservers();
	}

	public void reportError() {
		stopAgents();
		state = "Error";
		notifyObservers();
	}

	/**
	 * @param agents
	 *            The agents to set.
	 */
	private void setAgents(ArrayList agents) {
		if (agents != null)
			for (int i = 0; i < agents.size(); i++) {
				((Agent) agents.get(i)).setProcess(this);
			}
		this.agents = agents;
	}

	public String[][] getGazetteers() {
		return gazetteers;
	}

	public void setGazetteers(String[][] gazetteers) {
		this.gazetteers = gazetteers;
	}

	/**
	 * @return Returns the catalog.
	 */
	public String getCatalog() {
		return catalog;
	}

	/**
	 * @param catalog
	 *            The catalog to set.
	 */
	public void setCatalog(String catalog) {
		if (catalog != null)
			if (!catalog.equals(this.catalog)) {
				setAgents(null);
				this.catalog = catalog;
			}
	}

	/**
	 * @return Returns the fails.
	 */
	public String getFails() {
		return fails;
	}

	public Collection listFails() throws IOException, ClassNotFoundException {
		return getFailsCatalog().values();
	}

	/**
	 * @param fails
	 *            The fails to set.
	 */
	public void setFails(String fails) {
		if (fails != null)
			if (!fails.equals(this.fails)) {
				setAgents(null);
				this.fails = fails;
				this.failsCatalog = null;
			}
	}

	/**
	 * @return Returns the resources.
	 */
	public String[] getRepositories() {
		return repositories;
	}

	/**
	 * @param sites
	 *            The resources to set.
	 */
	public void setRepositories(String[] sites) {
		if (sites != null)
			if (!getUtils().equals(this.repositories, sites)) {
				setAgents(null);
				this.repositories = sites;
			}
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the state.
	 */
	public Object getState() {
		if (state == null)
			state = "Stoped";
		return state;
	}

	public String toString() {
		return "(" + getState() + ") " + this.name;
	}

	private ArrayList createAgents() throws InvalidDictionaryException,
			InvalidRepositoryException {

		Catalog catalog = getFactory().createFileCatalog(this.catalog);
		Catalog fails = getFailsCatalog();
		Repository[] repositories = getFactory().createRepositories(
				this.repositories);
		Gazetteer[] dictionaries = getFactory().createDictionaries(
				this.gazetteers);

		Catalog tempCatalog = getFactory().createMemoryCatalog();

		ArrayList agents = new ArrayList();
		Agent crawling = new CrawlingAgent("Crawling#1", repositories,
				tempCatalog, catalog, fails);
		Agent cataloguing = new CataloguingAgent("Cataloguing#1", dictionaries,
				tempCatalog, catalog, fails);
		agents.add(crawling);
		agents.add(cataloguing);
		setAgents(agents);

		return agents;
	}

	private Catalog getFailsCatalog() {
		if (failsCatalog == null)
			failsCatalog = getFactory().createFileCatalog(this.fails);
		return failsCatalog;
	}
}
