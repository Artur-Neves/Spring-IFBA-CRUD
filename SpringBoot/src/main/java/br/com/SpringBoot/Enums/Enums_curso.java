package br.com.SpringBoot.Enums;

// TODO: Auto-generated Javadoc
/**
 * The Enum Enums_curso.
 */
public enum Enums_curso {
      
      /** The administracao. */
      ADMINISTRACAO("administracao"),
      
      /** The informatica. */
      INFORMATICA("informatica"),
      
      /** The ELETROMECÂNICA. */
      ELETROMECÂNICA("eletromecanica"),
      
      /** The ENGENHARI A mecânica. */
      ENGENHARIA_MECÂNICA("Engenharia_Mecanica"),
      
      /** The direito. */
      DIREITO("Direito");
	
	/** The curso. */
	private String curso;
	
	/**
	 * Instantiates a new enums curso.
	 *
	 * @param curso the curso
	 */
	private Enums_curso (String curso) {
		this.curso = curso;
	}
}
