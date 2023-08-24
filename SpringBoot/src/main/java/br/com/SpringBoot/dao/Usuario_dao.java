package br.com.SpringBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.SpringBoot.Model.Usuario_Model;

// TODO: Auto-generated Javadoc
/**
 * The Interface Usuario_dao.
 */
public interface Usuario_dao extends JpaRepository<Usuario_Model, Integer> {
 
 /**
  * Find by email.
  *
  * @param email the email
  * @return the usuario model
  */
 // buscar e colocar dentro de uma lista os emails do ususario     
	@Query("select u from Usuario_Model u where u.email = :email")
	public Usuario_Model findByEmail(String email);
	
	/**
	 * Existusuario.
	 *
	 * @param usuario the usuario
	 * @param senha the senha
	 * @return the usuario model
	 */
	@Query("select u from Usuario_Model u where u.usuario= :usuario and u.senha= :senha")
	public Usuario_Model Existusuario(String usuario, String senha);
}
