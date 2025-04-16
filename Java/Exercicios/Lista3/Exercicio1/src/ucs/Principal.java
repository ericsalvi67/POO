package ucs;

public class Principal {
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		Misseravel m = new Misseravel();
		Pobre pb = new Pobre();
		Rica r = new Rica();
		
		r.fazCompras(50);
		
		System.out.println(m.mendiga());
		System.out.println(pb.trabalhar());
	}

}
