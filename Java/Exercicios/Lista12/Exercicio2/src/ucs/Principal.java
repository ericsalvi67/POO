package ucs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente(1,"Eric","12332122", 24));
		clientes.add(new Cliente(2,"Joao","6498465321", 29));
		clientes.add(new Cliente(3,"Marcos","498432139", 32));
		clientes.add(new Cliente(4,"Samuel","69786321", 55));
		clientes.add(new Cliente(5,"Roger","498465456", 41));
		clientes.add(new Cliente(6,"Carlo","4984321798", 12));
		clientes.add(new Cliente(7,"Denis","79684321", 36));
		
		Cliente nc = new Cliente(8,"Debora","79684321", 33);
		Principal p = new Principal();
		p.adicionaPrimeiro(clientes, nc);
		
		p.removeCliente(clientes, 3);
		
		
		for (Cliente c : clientes)
			System.out.println(c);
		
		List<Cliente> clientes2 = new ArrayList<>();
		
		System.out.println("---------------------------------------------------------------------------");
		
		p.copiaList(clientes,clientes2);
		
		for (Cliente c : clientes2)
			System.out.println(c);
		
		System.out.println("---------------------------------------------------------------------------");
		
		Collections.sort(clientes, new ClienteNomeComparator(ClienteNomeComparator.CRESCENTE));
		
		for (Cliente c : clientes)
			System.out.println(c);
		
		System.out.println("---------------------------------------------------------------------------");
		
		Collections.shuffle(clientes);
		
		for (Cliente c : clientes)
			System.out.println(c);
		
		System.out.println("---------------------------------------------------------------------------");
		
		Collections.sort(clientes2, new ClienteNomeComparator(ClienteNomeComparator.CRESCENTE));
		Collections.reverse(clientes2);
		
		for (Cliente c : clientes2)
			System.out.println(c);
		
		System.out.println("---------------------------------------------------------------------------");
		
		Collections.shuffle(clientes2);
		Collections.shuffle(clientes);
		
		Cliente c1 = Collections.max(clientes);
		System.out.print("MAX: " + c1);
		c1 = Collections.min(clientes);
		System.out.println("\tMIN: " + c1);
		c1 = Collections.max(clientes2);
		System.out.print("MAX: " + c1);
		c1 = Collections.min(clientes2);
		System.out.println("\tMIN: " + c1);
	}
	
	public void copiaList(List<Cliente> t1 , List<Cliente> t2) {
		t2.addAll(t1);
	}
	
	public void adicionaPrimeiro(List<Cliente> clientes , Cliente c) {
		clientes.add(0, c);
	}
	
	public void removeCliente(List<Cliente> clientes , int pos) {
		clientes.remove(pos);
	}
}
