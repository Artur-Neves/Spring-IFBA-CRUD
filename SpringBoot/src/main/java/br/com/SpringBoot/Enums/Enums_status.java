package br.com.SpringBoot.Enums;

// TODO: Auto-generated Javadoc
/**
 * The Enum Enums_status.
 */
public enum Enums_status {
   
   /** The ativo. */
   ATIVO("ativo"),
   
   /** The inativo. */
   INATIVO("inativo"),
   
   /** The trancado. */
   TRANCADO("trancado"), 
   
   /** The cancelado. */
   CANCELADO("cancelado");
	
	/** The status. */
	private String status;
	
	/**
	 * Instantiates a new enums status.
	 *
	 * @param status the status
	 */
	private Enums_status (String status) {
		this.status=status;
	}
}
