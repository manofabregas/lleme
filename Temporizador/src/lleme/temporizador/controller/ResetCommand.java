package lleme.temporizador.controller;

import lleme.lib.command.CommandImpl;
import lleme.temporizador.model.Temporizador;

public class ResetCommand extends CommandImpl {

	public void execute() {
		getReceiver().serviceReset();
	}

	public ResetCommand(Temporizador t) {
		super(t);
	}
}