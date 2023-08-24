package br.com.SpringBoot.Controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.SpringBoot.Exceptions.ServiceExcp;
import br.com.SpringBoot.Model.Aluno_Model;
import br.com.SpringBoot.Model.Usuario_Model;
import br.com.SpringBoot.Service.Service_Usuario;
import br.com.SpringBoot.dao.Usuario_dao;
import br.com.SpringBoot.util.Hash;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

// TODO: Auto-generated Javadoc
/**
 * The Class Usuario_Controller.
 */
@Controller
public class Usuario_Controller {
	
	/** The dao. */
	@Autowired
	Usuario_dao dao;
	 
 	/** The service. */
 	@Autowired
	   private Service_Usuario service;
	
	/**
	 * Login.
	 *
	 * @return the model and view
	 */
	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("usuario", new Usuario_Model());
		mv.setViewName("view/Login");
		return mv;
	}
	
	/**
	 * Cadastro.
	 *
	 * @return the model and view
	 */
	@GetMapping("/cadastro")
	public ModelAndView cadastro() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view/cadastro");
		mv.addObject("usuario", new Usuario_Model());
		return mv;
	}
	
	/**
	 * Cadastrado.
	 *
	 * @param usuario the usuario
	 * @return the model and view
	 * @throws Exception the exception
	 */
	@PostMapping("/salvarusuario")
	public ModelAndView cadastrado(Usuario_Model usuario) throws Exception {
		ModelAndView mv = new ModelAndView();
		service.salvarUsuario(usuario);
		mv.setViewName("redirect:/");
		return	mv;
	}
	
	/**
	 * Index.
	 *
	 * @return the model and view
	 */
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view/index");
		mv.addObject("aluno", new Aluno_Model());
		return mv;
	}
	
	/**
	 * Login.
	 *
	 * @param usuario the usuario
	 * @param session the session
	 * @return the model and view
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 * @throws ServiceExcp the service excp
	 */
	@PostMapping("/login")
	public ModelAndView login(@Valid Usuario_Model usuario, HttpSession session) throws NoSuchAlgorithmException, ServiceExcp{
		ModelAndView mv = new ModelAndView();
		mv.addObject("usuario", new Usuario_Model());
		Usuario_Model user = service.login(usuario.getusuario(), Hash.md5(usuario.getSenha()));
	if (user == null) {
		mv.addObject("msg", "Usuário não encontrado, tente novamente!");
		mv.setViewName("view/Login");
	}
	else {
		session.setAttribute("usuarioLogado", user);
		return index();
	}
		return mv;
	}
	
	/**
	 * Sair.
	 *
	 * @param sessao the sessao
	 * @return the model and view
	 */
	@PostMapping("/logout")
	public ModelAndView sair(HttpSession sessao) {
		sessao.invalidate();
		return login();
	}
}
