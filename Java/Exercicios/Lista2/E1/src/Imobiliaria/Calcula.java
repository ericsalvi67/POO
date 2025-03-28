package Imobiliaria;

import java.util.Scanner;

public class Calcula
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Calcula m = new Calcula();
		
		Terreno t = m.criaArea(sc);
		
		System.out.println(t);
		
		sc.close();
		
	}

	
	public Terreno criaArea(Scanner sc)
	{
		Terreno espaco = new Terreno(0,0);
		
		System.out.println("Informe o lado:");
		int x = sc.nextInt();
		espaco.setLado(x);
		
		System.out.println("Informe a altura:");
		x = sc.nextInt();
		espaco.setLargura(x);

		return espaco;
	}
}
