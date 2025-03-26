package ucs;

public class FichaInscricao {
	
	private static final double INVESTIMENTO = 20;
	
	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private String telefone;
	private String email;
	
	private boolean pago;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public static double getInvestimento() {
		return INVESTIMENTO;
	}

	
	
	public FichaInscricao() {
		super();
	}

	public FichaInscricao(String nome, String endereco, String cidade, String estado, String telefone, String email,
			boolean pago) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.email = email;
		this.pago = pago;
	}

	public FichaInscricao(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	
	
	
	public FichaInscricao createFichas(String nome, String endereco, String cidade, String estado, String telefone, String email,
			boolean pago)
	{
		return new FichaInscricao(nome, endereco, cidade, estado, telefone, email, pago);
	}
	
	public String toString()
	{
		return "\n NOME: "+ this.nome +
			   "\n ENDEREÇO: "+ this.endereco +
			   "\n CIDADE: "+ this.cidade +
			   "\n ESTADO: "+ this.estado +
			   "\n TELEFONE: "+ this.telefone +
			   "\n EMAIL: "+ this.email +
			   "\n PAGO: "+ this.pago + "\n";
	}
	
	
	
	
	
}
