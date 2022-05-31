package one.digitalinnovation.gof.strategy;

public class Robo {

	private Comportamento comportamento;

	public void setcomportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
