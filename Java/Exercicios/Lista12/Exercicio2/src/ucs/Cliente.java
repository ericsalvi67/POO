package ucs;

public class Cliente implements Comparable <Cliente> {
	
	int id;
	String nome;
	String telefone;
	int idade;

	public Cliente(int id, String nome, String telefone, int idade) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Cliente o) {
		return this.getNome().compareTo(o.getNome());
	}
	
	

}
