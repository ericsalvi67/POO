package ucs;

public abstract class Veiculo {
	private String placa;
	private int velocidade;
	public static final int VEL_MINIMA = 0;
	public static final int VEL_MAXIMA = 160;
	private Marca marca;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String placa) {
		this.placa = placa;
	}
	
	

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	public void acelerar(int intensidade) {
		this.velocidade += Math.abs(intensidade);
		if(this.velocidade > VEL_MAXIMA) {
			this.velocidade = VEL_MAXIMA;
		}
	}
	
	public void frear(int intensidade) {
		this.velocidade -= Math.abs(intensidade);
		if(this.velocidade < VEL_MINIMA) {
			this.velocidade = VEL_MINIMA;
		}
	}
	
	public String toString() {
		return "O "+this.getClass().getName()+ ", "+ this.getPlaca() + " esta  a " + this.getVelocidade() + " Km/h." ;
	}
	
}
