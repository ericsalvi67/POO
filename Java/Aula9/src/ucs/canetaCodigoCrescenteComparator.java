package ucs;

import java.util.Comparator;

public class canetaCodigoCrescenteComparator implements Comparator<caneta>{

	public canetaCodigoCrescenteComparator() {
	}
	
	@Override
	public int compare(caneta o1, caneta o2) {
		return o1.getCod() - o2.getCod();
	}

}
