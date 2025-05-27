package ucs;

public class DepositoInvalidoException extends Exception {
	
	public static String MESSAGE = "Tentativa de insercao de valores invalidos";
	private int codigoErro = 56;

	public DepositoInvalidoException() {
		super(MESSAGE);
	}

	public DepositoInvalidoException(String message) {
		super(MESSAGE + " " + message);
		// TODO Auto-generated constructor stub
	}

	public DepositoInvalidoException(Throwable cause) {
		super(MESSAGE + " " + cause);
		// TODO Auto-generated constructor stub
	}

	public DepositoInvalidoException(String message, Throwable cause) {
		super(MESSAGE + " " + message, cause);
		// TODO Auto-generated constructor stub
	}

	public DepositoInvalidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(MESSAGE + " " + message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	
	public int getCodigoErro() {
		return this.codigoErro;
	}

}
