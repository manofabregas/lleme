package br.pucrio.inf.catfwk.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import br.pucrio.inf.catfwk.view.CurrentWsp;

/**
 * @author Luiz Andr�
 * @version 1.0
 * @since 1.0
 * @alias UpdateProcessAction*/
public class UpdateProcessAction extends AbstractAction {

	private static final long serialVersionUID = 5245227434505555313L;
	private CurrentWsp currentWspImpl = null;

	public void actionPerformed(ActionEvent e) {
		currentWspImpl.updateProcess();
	}

	/**
	 * @return Returns the currentWspImpl.
	 */
	public CurrentWsp getCurrentWspImpl() {
		return currentWspImpl;
	}

	/**
	 * @param currentWspImpl
	 *            The currentWspImpl to set.
	 */
	public void setCurrentWspImpl(CurrentWsp currentWspImpl) {
		this.currentWspImpl = currentWspImpl;
	}

}
