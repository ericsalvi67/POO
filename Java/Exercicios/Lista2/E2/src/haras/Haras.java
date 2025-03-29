package haras;

import java.util.Scanner;

public class Haras {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Haras h = new Haras();
		Ferraduras f =  h.contaFerraduras(sc);
		
		System.out.println(f);
		System.out.println("Ferraduras "+ f.getFerraduras() +"\n");
		
	}
	
	
	
	public Ferraduras contaFerraduras(Scanner sc)
	{
		
		Ferraduras conta = new Ferraduras(0); 
		
		System.out.println("Quantos cavalos há no Haras?");
		int c = sc.nextInt();
		conta.setCavalos(c);
		
		return conta;
	}

}
