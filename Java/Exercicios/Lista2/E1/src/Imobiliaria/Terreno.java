package Imobiliaria;

public class Terreno 
{
	private int lado;
	private int largura;
	
	
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
	
	
	public Terreno(int lado, int largura) {
		super();
		this.lado = lado;
		this.largura = largura;
	}
	
	
	public String toString()
	{
		return "\n ALTURA: "+ this.lado +
			   "\n LARGURA: "+ this.largura +
			   "\n AREA: "+ this.lado*this.largura + "\n";
	}
	
	
}
