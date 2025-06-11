package ucs;

import java.util.Comparator;

public class ClienteNomeComparator implements Comparator<Cliente>{
	
	public static final int CRESCENTE = 0;
	public static final int DECRESCENTE = 1;
	private int ordem;

	public ClienteNomeComparator(int ordem) {
		this.ordem = ordem;
	}
	
	@Override
	public int compare(Cliente o1, Cliente o2) {
		if (ordem == CRESCENTE)
			return o1.getNome().compareTo(o2.getNome());
		else
			return o2.getNome().compareTo(o1.getNome());
	}


}
