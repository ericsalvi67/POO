package ucs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		caneta c = new caneta(1, "Preta");
		System.out.println(c);
		System.out.println("------------------------------------------------------------------------");
		
		List<caneta> canetas = new LinkedList<>();
		
		canetas.add(c);
		canetas.add(new caneta(2, "Azul"));
		canetas.add(new caneta(3, "Vermelha"));
		
		
		for (int i = 0; i < canetas.size(); i++) {
			caneta x = canetas.get(i);
			System.out.println(x);
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		for (caneta ca : canetas) {
			System.out.println(ca);
		}
		
		System.out.println("------------------------------------------------------------------------");

		caneta y = new caneta(3);
		
		System.out.println(canetas.contains(y));
		
		int indice = canetas.indexOf(y);
		
		if(indice >= 0) {
			System.out.println("Encontrei na posicao " + indice);
			System.out.println(canetas.get(indice));
		}else {
			System.out.println("Nao achou");
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		List<caneta> canetas2 = new LinkedList<>();
		canetas2.add(new caneta(6, "Roxo"));
		canetas2.add(new caneta(7, "Verde"));
		
		canetas.addAll(canetas2);
		
		for (caneta ca : canetas) {
			System.out.println(ca);
		}
		
		System.out.println("------------------------------------------------------------------------");

	}

}
