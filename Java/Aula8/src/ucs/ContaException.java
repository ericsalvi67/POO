package ucs;

public class ContaException extends Exception {
	
	public static String MESSAGE = "Tentativa de saque de valores invalidos";
	private int codigoErro = 24;

	public ContaException() {
		// TODO Auto-generated constructor stub
	}

	public ContaException(String message) {
		super(MESSAGE);
		// TODO Auto-generated constructor stub
	}

	public ContaException(Throwable cause) {
		super(MESSAGE + " " + cause);
		// TODO Auto-generated constructor stub
	}

	public ContaException(String message, Throwable cause) {
		super(MESSAGE + " " + message, cause);
		// TODO Auto-generated constructor stub
	}

	public ContaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(MESSAGE + " " + message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	
	public int getCodigoErro() {
		return this.codigoErro;
	}

}
