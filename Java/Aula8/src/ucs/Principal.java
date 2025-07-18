package ucs;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria(6969);
		System.out.println(c);
		
		try {
			c.deposita(2000);
		} catch (DepositoInvalidoException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCodigoErro());
		} catch (DepositoExageradoException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCodigoErro());
		}
		
		try {
			c.saca(200);
		} catch (ContaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCodigoErro());
		}
		
		System.out.println(c);
	}

}
