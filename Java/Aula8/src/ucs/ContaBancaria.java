package ucs;

public class ContaBancaria {
	
	private int numero;
	private float saldo;
	
	public ContaBancaria() {
		// TODO Auto-generated constructor stub
	}
	public ContaBancaria(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(float quantia) throws DepositoInvalidoException, DepositoExageradoException{
		if(quantia <= 0) {
			throw new DepositoInvalidoException("R$" + quantia);
		}
		if(quantia > 5000000) {
			throw new DepositoExageradoException("R$" + quantia);
		}
		System.out.println("Depositando.. "+ quantia);
		setSaldo(quantia);
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [numero=" + numero + ", saldo=" + saldo + "]";
	}

}
