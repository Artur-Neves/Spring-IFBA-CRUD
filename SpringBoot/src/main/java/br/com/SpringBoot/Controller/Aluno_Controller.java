package br.com.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.SpringBoot.Model.Aluno_Model;
import br.com.SpringBoot.dao.Aluno_dao;

// TODO: Auto-generated Javadoc
/**
 * The Class Aluno_Controller.
 */
@Controller
public class Aluno_Controller {
	
	/** The alunodao. */
	@Autowired
 private Aluno_dao alunodao;
	 
 	/**
 	 * Inserir alunos.
 	 *
 	 * @param aluno the aluno
 	 * @return the model and view
 	 */
 	@GetMapping("/inseriraluno")
	 public ModelAndView inserirAlunos(Aluno_Model aluno) {
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("view/inseriraluno");
		 mv.addObject("aluno", new Aluno_Model());

		 return mv;
	 }
	 
 	/**
 	 * Inserir aluno.
 	 *
 	 * @param aluno the aluno
 	 * @return the model and view
 	 */
 	@PostMapping("/inseriraluno")
	 public ModelAndView inserirAluno (Aluno_Model aluno) {
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("redirect:/ListAlunos/todos");
		 alunodao.save(aluno);
		 return mv;
	 }
	 
	 /**
 	 * Editar alunos.
 	 *
 	 * @param id the id
 	 * @param status the status
 	 * @return the model and view
 	 */
 	@SuppressWarnings("deprecation")
	@GetMapping("/ListAlunos/editar/{id}/{status}")
	 public ModelAndView editarAlunos (@PathVariable("id") int id ,@PathVariable("status") String status) {
		 ModelAndView mv = new ModelAndView ();
		 mv.setViewName("view/EditarAluno");
		 Aluno_Model aluno = alunodao.getById(id);
		 mv.addObject("alunoeditar", aluno);
		 mv.addObject("status", status);
		 return mv;
	 }
	 
 	/**
 	 * Alunoeditado.
 	 *
 	 * @param status the status
 	 * @param aluno the aluno
 	 * @return the model and view
 	 */
 	@PostMapping("/alunoeditado/{status}")
	 public ModelAndView alunoeditado (@PathVariable("status") String status,Aluno_Model aluno) {
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("redirect:/ListAlunos/"+status);
		 alunodao.save(aluno);
		 return mv;
	 }
	 
 	/**
 	 * Excluir aluno.
 	 *
 	 * @param id the id
 	 * @param status the status
 	 * @return the string
 	 */
 	@GetMapping("/ListAlunos/excluir/{id}/{status}")
	 public String excluirAluno(@PathVariable("id") int id, @PathVariable("status") String status) {
		 alunodao.deleteById(id);
		 return "redirect:/ListAlunos/"+status;
	 }
	 
 	/**
 	 * Filtraraluno.
 	 *
 	 * @return the model and view
 	 */
 	@GetMapping("/FiltragemAluno")
	 public ModelAndView filtraraluno() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view/FiltragemAluno");
		mv.addObject("turnos", alunodao.findAll());
		mv.addObject("aluno", new Aluno_Model());
		return mv;
	 }
	 
 	/**
 	 * Alunos ativos.
 	 *
 	 * @param nome the nome
 	 * @param status the status
 	 * @return the model and view
 	 */
 	@GetMapping("/ListAlunos/{status}")
	 public ModelAndView alunosAtivos(@RequestParam(required = false) String nome, @PathVariable("status") String status) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("status", status);
		switch (status) {
		case "todos": {
			mv.setViewName("view/ListAlunos");
			mv.addObject("title", "Alunos inseridos");
			 mv.addObject("alunos", alunodao.findAll());
			 break;
		}
		case "ativos":{
			mv.setViewName("view/ListAlunos");
			mv.addObject("title", "Alunos ativos");
			mv.addObject("alunos", alunodao.ativos());
			break;
		}
		case "inativos":{
			mv.setViewName("view/ListAlunos");
			mv.addObject("title", "Alunos inativos");
			 mv.addObject("alunos", alunodao.inativos());
			 break;
		}
		case "trancados":{
			mv.setViewName("view/ListAlunos");
			mv.addObject("title", "Alunos trancados");
			 mv.addObject("alunos", alunodao.trancados());
			 break;
		}
		case "cancelado":{
			mv.setViewName("view/ListAlunos");
			mv.addObject("title", "Alunos cancelado");
			 mv.addObject("alunos", alunodao.cancelados());
			 break;
		}
		default:
			if (nome== null || nome.trim().isEmpty()) {
				mv.setViewName("view/ListAlunos");
				mv.addObject("title", "Alunos inseridos");
				 mv.addObject("alunos", alunodao.findAll());
		}
			else{
				mv.setViewName("view/ListAlunos");
			mv.addObject("title", nome);
			mv.addObject("alunos", alunodao.findByNomeContainingIgnoreCase(nome));
			}
			}
		
		return mv;
	 }
	 
}
