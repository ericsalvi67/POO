package haras;

public class Ferraduras {
	
	private int cavalos;
	private int ferraduras;

	public int getCavalos() {
		return cavalos;
	}

	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
		setFerraduras(cavalos);
	}
	
	public Ferraduras(int cavalos)
	{
		super();
		this.cavalos = cavalos;
	}
	
	public void setFerraduras(int cavalos)
	{
		this.ferraduras= cavalos*4;
	}
	
	public int getFerraduras()
	{
		return this.ferraduras;
	}

	@Override
	public String toString() {
		return "Ferraduras \n[cavalos=" + cavalos + "] \n[ferraduras="+ cavalos*4 +"]\n";
	}
	

}
