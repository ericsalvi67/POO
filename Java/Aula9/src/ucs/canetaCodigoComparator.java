package ucs;

import java.util.Comparator;

public class canetaCodigoComparator implements Comparator<caneta>{
	
	public static final int CRESCENTE = 0;
	public static final int DECRESCENTE = 1;
	private int ordem;

	public canetaCodigoComparator(int ordem) {
		this.ordem = ordem;
	}
	
	
	@Override
	public int compare(caneta o1, caneta o2) {
		if (ordem == CRESCENTE)
			return o1.getCod() - o2.getCod();
		else
			return o2.getCod() - o1.getCod();
	}

}
