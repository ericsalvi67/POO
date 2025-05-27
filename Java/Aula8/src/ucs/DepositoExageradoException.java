package ucs;

public class DepositoExageradoException extends Exception {
	
	public static String MESSAGE = "Tentativa de insercao de valores muito elevados";
	private int codigoErro = 59;

	public DepositoExageradoException() {
		super(MESSAGE);
	}

	public DepositoExageradoException(String message) {
		super(MESSAGE + " " + message);
		// TODO Auto-generated constructor stub
	}

	public DepositoExageradoException(Throwable cause) {
		super(MESSAGE + " " + cause);
		// TODO Auto-generated constructor stub
	}

	public DepositoExageradoException(String message, Throwable cause) {
		super(MESSAGE + " " + message, cause);
		// TODO Auto-generated constructor stub
	}

	public DepositoExageradoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(MESSAGE + " " + message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	
	public int getCodigoErro() {
		return this.codigoErro;
	}

}
