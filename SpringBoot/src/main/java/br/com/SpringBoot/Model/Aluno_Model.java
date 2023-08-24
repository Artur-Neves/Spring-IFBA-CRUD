package br.com.SpringBoot.Model;

import br.com.SpringBoot.Enums.Enums_curso;
import br.com.SpringBoot.Enums.Enums_status;
import br.com.SpringBoot.Enums.Enums_turnos;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno_Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Column (name = "nome", length = 45)
    private String nome;
    // são valores fixos e constantes que
    // não podem ser mudados 
    @Column (name="curso")
    @Enumerated(EnumType.STRING)
    private Enums_curso curso;
    private String matricula;
    @Enumerated(EnumType.STRING)
    private Enums_status status;
    private Enums_turnos turno;
    
    
	public Aluno_Model(int id, String nome, Enums_curso curso, String matricula, Enums_status status, Enums_turnos turno) {
		this.id = id;
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.status = status;
		this.turno = turno;
	}
	public Aluno_Model() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Enums_curso getCurso() {
		return curso;
	}
	public void setCurso(Enums_curso curso) {
		this.curso = curso;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	 
	public Enums_status getStatus() {
		return status;
	}

	public void setStatus(Enums_status status) {
		this.status = status;
	}

	public Enums_turnos getTurno() {
		return turno;
	}
	public void setTurno(Enums_turnos turno) {
		this.turno = turno;
	}
    
    

}
