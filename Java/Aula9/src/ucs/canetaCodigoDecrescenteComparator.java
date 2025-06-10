package ucs;

import java.util.Comparator;

public class canetaCodigoDecrescenteComparator implements Comparator<caneta>{

	public canetaCodigoDecrescenteComparator() {
	}
	
	@Override
	public int compare(caneta o1, caneta o2) {
		return o2.getCod() - o1.getCod();
	}

}
