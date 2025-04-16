package ucs;

public class Caminhao extends Veiculo{
	private int capacidadeCarga;
	
	public Caminhao() {
		super();
	}
	
	public Caminhao(String placa, int capacidadeCarga) {
		super(placa);
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
	@Override
	public void acelerar(int velocidade) {
		super.acelerar(velocidade/2);
	}
	
	public String toString() {
		return super.toString() + " Levando " +this.getCapacidadeCarga()+ " Kg.";
	}
}
