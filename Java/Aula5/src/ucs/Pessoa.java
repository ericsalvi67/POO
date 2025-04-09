package ucs;

public class Pessoa {
	private String nome;
	private int peso;
	private Carro carro;

	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public Pessoa() {
		
	}
	public Pessoa(String nome, int peso) {
		this.nome = nome;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		if(this.carro == null) {
			this.peso = peso;
		}

	}
	
}
