/* Generated by Together */

package ic.tcc00175.biblioteca.model;

import ic.tcc00175.biblioteca.model.patterns.adapter.MaterialColecao;

/**
 * @persistent
 */
public class Biblioteca extends ic.tcc00175.biblioteca.model.BusinessObject {

	public Biblioteca() {
		super();
		lnkMaterial = new MaterialColecao();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public MaterialColecao getLnkMaterial() {
		return lnkMaterial;
	}

	public void setLnkMaterial(MaterialColecao lnkMaterial) {
		this.lnkMaterial = lnkMaterial;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8398678154930943287L;

	/* # private Biblioteca _biblioteca; */

	private String nome = null;

	/**
	 * @link aggregationByValue
	 * @associates <{Material}>
	 * @directed
	 * @supplierCardinality 0..*
	 * @clientCardinality 1
	 */
	private MaterialColecao lnkMaterial = null;
}
