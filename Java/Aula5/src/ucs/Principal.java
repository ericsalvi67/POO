package ucs;

public class Principal {
	
	public static void main(String[] args) {
		
		Carro c = new Carro("Polo", 5, 400);
		Pessoa p = new Pessoa("Mickey", 100);
		Pessoa p1 = new Pessoa("Cleber", 100);
		Pessoa p2 = new Pessoa("Joao", 100);
		Pessoa p3 = new Pessoa("Deison", 100);
		Principal pr = new Principal();
		
		pr.embarcaPessoa(c, p);
		pr.embarcaPessoa(c, p1);
		pr.embarcaPessoa(c, p2);
		pr.embarcaPessoa(c, p3);
		pr.desembarcaPessoa(c, "Joao");
		pr.embarcaPessoa(c, p);
		pr.embarcaPessoa(c, p);
		
	}

	
	
	public void embarcaPessoa(Carro c, Pessoa p) {
		System.out.println("Tentando embarcar " + p.getNome());
		
		if(c.embarcar(p)) {
			System.out.println("Embarcado com sucesso");
		}
		else {
			System.out.println("O carro esta cheio");
		}
		
		System.out.println(c.getSituacao());
	}
	
	public void desembarcaPessoa(Carro c, String nome) {
		System.out.println("Tentando desembarcar " + nome);
		
		if(c.desembarcar(nome)) {
			System.out.println("Desembarcado com sucesso");
		}
		else {
			System.out.println("Essa pessoa nao esta no carro");
		}
		
		System.out.println(c.getSituacao());
	}
}
