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
		Terreno espaco = new Terreno();
		Endereco e = new Endereco();
		String resposta;
		
		System.out.println("Informe o lado:");
		int x = sc.nextInt();
		espaco.setLado(x);
		
		System.out.println("Informe a altura:");
		x = sc.nextInt();
		espaco.setLargura(x);
		sc.hasNextLine();
		
		System.out.println("Quer informar o endereço? ");
		resposta = sc.nextLine();
		if("s".equals(resposta) || "S".equals(resposta));
		{
			System.out.println("Rua: ");
			resposta = sc.nextLine();
			espaco.setEndereco(e);
			e.setRua(resposta);
			
			System.out.println("Qual o numero: ");
			resposta = sc.nextLine();
			e.setNro(resposta);
		}
		
		System.out.println("Quer informar o dono? ");
		resposta =  sc.nextLine();
		if("s".equals(resposta) || "S".equals(resposta));
		{
			
		}
		
		
	

		return espaco;
	}
}
