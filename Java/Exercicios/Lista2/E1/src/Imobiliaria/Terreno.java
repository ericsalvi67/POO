package Imobiliaria;

public class Terreno 
{
	private int lado;
	private int largura;
	private Endereco endereco;
	private Pessoa dono;
	
	
	public Pessoa getDono() {
		return dono;
	}
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}
	public int getArea() {
		return getLado()*getLargura();
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int altura) {
		this.lado = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public String toString()
	{
		return "\n ALTURA: "+ this.lado +
			   "\n LARGURA: "+ this.largura +
			   "\n AREA: "+ this.getArea() + "\n";
	}
	
	
}
