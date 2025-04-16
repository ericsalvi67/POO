package ucs;

public class Rica extends Pessoa {
	private double dinheiro;

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public Rica() {
		// TODO Auto-generated constructor stub
	}

	public Rica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public void fazCompras(int gastos) {
		this.dinheiro -= gastos;
		
	}

}
