package ucs;

public class Misseravel extends Pessoa {

	public Misseravel() {
		// TODO Auto-generated constructor stub
	}

	public Misseravel(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public String mendiga() {
		return super.falar() + " Por Favor Lula me ajuda";
	}
	
	

}
