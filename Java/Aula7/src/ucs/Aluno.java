package ucs;

public class Aluno {
	
	private int codigo;
	private String nome;
	
	private static int ultimoCodigo = 1;
	
	private Aluno() {
		this.codigo = ultimoCodigo ++;
	}
	
	public Aluno(String nome) {
		this();
		this.nome = nome;
	}
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.codigo +" . "+ this.nome;
	}
	
}
