package br.com.SpringBoot.Service;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.SpringBoot.Exceptions.CriptoExistException;
import br.com.SpringBoot.Exceptions.EmailExist;
import br.com.SpringBoot.Exceptions.ServiceExcp;
import br.com.SpringBoot.Model.Usuario_Model;
import br.com.SpringBoot.dao.Usuario_dao;
import br.com.SpringBoot.util.Hash;

// TODO: Auto-generated Javadoc
/**
 * The Class Service_Usuario.
 */
@Service
public class Service_Usuario {
   
   /** The dao. */
   @Autowired
	private Usuario_dao dao;
  
	/**
	 * Salvar usuario.
	 *
	 * @param usuario the usuario
	 * @throws Exception the exception
	 */
	public void salvarUsuario(Usuario_Model usuario) throws Exception{
	  try {
		if (dao.findByEmail(usuario.getEmail())!= null) {
			throw new EmailExist ("já existe um email cadastrado");
		}
		usuario.setSenha(Hash.md5(usuario.getSenha()));
	} catch (NoSuchAlgorithmException e) {
		throw new CriptoExistException("error na criptografia");
	}
	  dao.save(usuario);  }

 /**
  * Login.
  *
  * @param nome the nome
  * @param senha the senha
  * @return the usuario model
  * @throws ServiceExcp the service excp
  */
 public Usuario_Model login(String nome, String senha) throws ServiceExcp{
		  Usuario_Model usuario = dao.Existusuario(nome, senha);
		  return usuario;
	
  }
}
