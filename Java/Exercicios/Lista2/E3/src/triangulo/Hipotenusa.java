package triangulo;

import java.util.Scanner;

public class Hipotenusa {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Hipotenusa h = new Hipotenusa();
		
		catetos c = h.calchipo(sc);
		
		System.out.println(c);
		System.out.println("Hipotenusa : "+ c.getHipotenusa()+"\n");
	}
	
	
	public catetos calchipo(Scanner sc)
	{
		catetos calc = new catetos();
		
		System.out.println("Cateto 1:");
		int c = sc.nextInt();
		calc.setCateto1(c);
		
		System.out.println("Cateto 2:");
		c = sc.nextInt();
		calc.setCateto2(c);
		
		return calc;
	}
	
}
