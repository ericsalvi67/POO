package ucs;

import java.util.Objects;

public class caneta {
	
	private int cod;
	private String cor;
	
	public caneta() {
		// TODO Auto-generated constructor stub
	}

	public caneta(int cod, String cor) {
		super();
		this.cod = cod;
		this.cor = cor;
	}

	public caneta(int cod) {
		this.cod = cod;
	}
	public caneta(String cor) {
		this.cor = cor;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "caneta [cod=" + cod + ", cor=" + cor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		caneta other = (caneta) obj;
		return cod == other.cod;
	}
	

}
