package triangulo;

public class catetos 
{
	private int cateto1;
	private int cateto2;
	private float hipotenusa;
	
	public float getHipotenusa() {
		float q = (float) Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
		return q;
	}
	public int getCateto1() {
		return cateto1;
	}
	public void setCateto1(int cateto1) {
		this.cateto1 = cateto1;
	}
	public int getCateto2() {
		return cateto2;
	}
	public void setCateto2(int cateto2) {
		this.cateto2 = cateto2;
	}
	
	
	public catetos() {
		super();
	}
	
	@Override
	public String toString() {
		return "catetos [cateto1 = " + cateto1 + "]  [cateto2 = " + cateto2 + "]";
	}

}
