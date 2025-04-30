package ucs;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno ("Mickey");
		Aluno a2 = new Aluno ("Minie");
		Aluno a3 = new Aluno ("Pluto");
		
		System.out.println(a1);
		System.out.println(a3);
		System.out.println(a2);
		
		int a, b , c;
		
		AulaStatic au = new AulaStatic();
		a = 5;
		b = 3;
		c = au.soma(a,b);
		
		AulaStatic ab = new AulaStatic();
		ab.setNome("quarta"); 
		System.out.println(ab.getNome());
	}

}
