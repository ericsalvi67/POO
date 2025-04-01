package Salario;

import java.util.Scanner;

public class CalculaSalario {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalculaSalario cs = new CalculaSalario();
		
		SalarioMinimo sm = cs.calcsal(sc);
		
		System.out.println("Voce recebe "+sm.getSalarioQ(sm.getSalariomin(),sm.getSalario())+"x vezes o salario minimo ("+sm.getSalariomin()+")\n");
	}
	
	
	public SalarioMinimo calcsal(Scanner sc)
	{
		SalarioMinimo sm = new SalarioMinimo();
		
		System.out.println("Digite o salario minimo: ");
		int s = sc.nextInt();
		sm.setSalariomin(s);
		
		System.out.println("Digite seu salario: ");
		s = sc.nextInt();
		sm.setSalario(s);
		
		return sm;
	}
	
}
