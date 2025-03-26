package ucs;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) 
	{
		
		Carro c1;
		Scanner sc = new Scanner(System.in);
		
		c1 = new Carro();
		
		System.out.println("Informe o nome do carro: ");
		String s = sc.nextLine();
		c1.setNome(s);
		System.out.println("Informe a cor: ");
		s = sc.nextLine();
		c1.setCor(s);
		System.out.println("Informe a potencia: ");
		int i = sc.nextInt();
		sc.nextLine();
		c1.setPotencia(i);
		System.out.println("Informe a placa: ");
		s = sc.nextLine();
		c1.setPlaca(s);
		
		System.out.println("Acelera quanto (1 - 20): ");
		i = sc.nextInt();
		sc.nextLine();
		for (int j = 0; j < i; j++) {
			c1.acelera();
		}


		System.out.println(c1);
		
		sc.close();

	}
}
