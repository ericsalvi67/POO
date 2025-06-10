package ucs;

import java.util.Comparator;

public class canetaCorComparator implements Comparator<caneta>{
	
	public static final int CRESCENTE = 0;
	public static final int DECRESCENTE = 1;
	private int ordem;

	public canetaCorComparator(int ordem) {
		this.ordem = ordem;
	}
	
	
	@Override
	public int compare(caneta o1, caneta o2) {
		if (ordem == CRESCENTE)
			return o1.getCor().compareTo(o2.getCor());
		else
			return o2.getCor().compareTo(o1.getCor());
	}

}
