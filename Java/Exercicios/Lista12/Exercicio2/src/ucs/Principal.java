package ucs;

import java.util.ArrayList;
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
	}

	
	public void adicionaPrimeiro(List<Cliente> clientes , Cliente c) {
		clientes.add(0, c);
	}
	
	public void removeCliente(List<Cliente> clientes , int pos) {
		clientes.remove(pos);
	}
}
