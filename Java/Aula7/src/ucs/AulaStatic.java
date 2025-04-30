package ucs;

public class AulaStatic {
	
	private String nome;
	private static int numero;
	
	public static int getNumero() {
		return numero;
	}

	public static void setNumero(int numero) {
		AulaStatic.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public AulaStatic() {
	}
	
	public int soma(int a, int b) {
		return a + b;
	}

}
