package ucs;

public class OnibusEletrico extends Onibus{
	private int potenciaBateria;
	
	public OnibusEletrico() {
		super();
	}
	public OnibusEletrico(String placa,int nroCapacidade, int potenciaBateria) {
		super(placa,nroCapacidade);
		this.potenciaBateria = potenciaBateria;
	}

	public int getPotenciaBateria() {
		return potenciaBateria;
	}

	public void setPotenciaBateria(int potenciaBateria) {
		this.potenciaBateria = potenciaBateria;
	}
	
	public String toString() {
		return super.toString() + " Com " +this.getPotenciaBateria() + " KW/H de bateria.";
	}
}
