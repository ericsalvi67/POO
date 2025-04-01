package Salario;

public class SalarioMinimo {
	private int salario;
	private int salariomin;

	public int getSalariomin() {
		return salariomin;
	}

	public void setSalariomin(int salariomin) {
		this.salariomin = salariomin;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public float getSalarioQ(float salmin, float sal)
	{
		return sal/salmin;
	}
}
