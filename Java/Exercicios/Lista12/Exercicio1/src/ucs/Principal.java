package ucs;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Cores> cor = new ArrayList<>();
		
		cor.add(new Cores("Azul"));
		cor.add(new Cores("Amarelo"));
		
		for (Cores ca : cor ) {
			System.out.println(ca);
		}
	}

}
