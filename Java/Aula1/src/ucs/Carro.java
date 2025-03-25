package ucs;

public class Carro {

	private String nome;
	private String cor;
	private int potencia;
	private String placa;
	private int velocidade = 0;
	private static final int VELOCIDADE_MAX = 240;
	
	public void setNome(String nome) {
		
		if(nome == null || nome.length() < 3) {
			this.nome = "Indeterminado";
		}
		else {
			this.nome = nome;
		}
	}
	
	public String getNome() {
		return this.nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		if (potencia < 0) {
			this.potencia = 0;
		} else {
			this.potencia = potencia;
		}
		this.potencia = potencia;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void acelera() {
		if (this.velocidade < VELOCIDADE_MAX){
			this.velocidade += 10;
		}
	}
	
	public void freia() {
		if(this.velocidade > 0) {
			this.velocidade -=10 ;
		}
		if(this.velocidade < 0) {
			this.velocidade = 0;
		}
	}
	
	public int getVelocidade() {
		return this.getVelocidade();
	}
	
	
	public void mostra() {
		System.out.println("-------------------------------------------");
		System.out.println("Nome : " + this.getNome());
		System.out.println("Cor : " + this.getCor());
		System.out.println("Potencia : " + this.getPotencia());
		System.out.println("Placa : " + this.getPlaca());
		System.out.println("Velocidade : " + getVelocidade() + "KM/H");
		System.out.println("-------------------------------------------");
	}
	
	
}
