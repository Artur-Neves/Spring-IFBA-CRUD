package br.com.SpringBoot.dao;

import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.SpringBoot.Model.Aluno_Model;

// TODO: Auto-generated Javadoc
/**
 * The Interface Aluno_dao.
 */

@Component
@Repository
public interface Aluno_dao extends JpaRepository<Aluno_Model, Integer> {
    
    /**
     * Ativos.
     *
     * @return the list
     */
    @Query("select a from Aluno_Model as a where a.status='ATIVO'")
	 public List<Aluno_Model> ativos();
	
	/**
	 * Inativos.
	 *
	 * @return the list
	 */
	@Query("select a from Aluno_Model as a where a.status='INATIVO'")
	 public List<Aluno_Model> inativos();
	
	/**
	 * Trancados.
	 *
	 * @return the list
	 */
	@Query("select a from Aluno_Model as a where a.status='TRANCADO'")
	 public List<Aluno_Model> trancados();
	
	/**
	 * Cancelados.
	 *
	 * @return the list
	 */
	@Query("select a from Aluno_Model as a where a.status='CANCELADO'")
	 public List<Aluno_Model> cancelados();
	
	/**
	 * Find by nome containing ignore case.
	 *
	 * @param nome the nome
	 * @return the list
	 */
	public List<Aluno_Model> findByNomeContainingIgnoreCase (String nome);
}
