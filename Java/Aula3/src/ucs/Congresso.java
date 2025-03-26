package ucs;

import java.util.Scanner;

public class Congresso {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Congresso c = new Congresso();
		
		FichaInscricao f1 = c.criaFichas(sc);
		FichaInscricao f2 = c.criaFichas(sc);
		
		
		sc.close();
		
		
	}
	
	public static FichaInscricao criaFichas(Scanner sc)
	{
		
		FichaInscricao fichas = new FichaInscricao();
		
		System.out.println("Informe o nome: ");
		String s = sc.nextLine();
		fichas.setNome(s);
		
		System.out.println("Informe o endereço: ");
		s = sc.nextLine();
		fichas.setEndereco(s);
		
		System.out.println("Informe o cidade: ");
		s = sc.nextLine();
		fichas.setCidade(s);
		
		System.out.println("Informe o estado: ");
		s = sc.nextLine();
		fichas.setEstado(s);
		
		System.out.println("Informe o telefone: ");
		s = sc.nextLine();
		fichas.setTelefone(s);
		
		System.out.println("Informe o email: ");
		s = sc.nextLine();
		fichas.setEmail(s);
		
		System.out.println("Foi pago o valor:\t (S = sim / N = nao): ");
		s = sc.nextLine();
		if(s.equals("S") || s.equals("s") || s.toLowerCase().equals("sim"))
		{
			fichas.setPago(true);
		}
	
		return fichas;
	}
	
}
	
