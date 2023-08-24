package br.com.SpringBoot.Enums;

// TODO: Auto-generated Javadoc
/**
 * The Enum Enums_turnos.
 */
public enum Enums_turnos {
  
  /** The matutino. */
  MATUTINO("matutino"),
  
  /** The vespertino. */
  VESPERTINO("vespertino"),
  
  /** The noturno. */
  NOTURNO("noturno");
	
	/** The turno. */
	private String turno;
	
	/**
	 * Instantiates a new enums turnos.
	 *
	 * @param turno the turno
	 */
	private Enums_turnos(String turno) {
		this.turno=turno;
	}
}
