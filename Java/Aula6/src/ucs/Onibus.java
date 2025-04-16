package ucs;

public class Onibus extends Veiculo{
	private int nroPassageiros;
	
	public Onibus() {
		super();
	}
	public Onibus(String placa, int nroPassageiros) {
		super(placa);
		this.nroPassageiros = nroPassageiros;
	}

	public int getNroPassageiros() {
		return nroPassageiros;
	}

	public void setNroPassageiros(int nroPassageiros) {
		this.nroPassageiros = nroPassageiros;
	}
	
	public String toString() {
		return super.toString() + " Levando " +this.getNroPassageiros()+ " passageiros.";
	}
	
}
