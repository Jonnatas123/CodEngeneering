package br.com.codEngeneering.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.codEngeneering.desenvolvedor.Desenvolvedor;
import br.com.codEngeneering.desenvolvedor.DesenvolvedorService;
import br.com.codEngeneering.project.Project;
import br.com.codEngeneering.project.ProjectService;

@Controller
@RequestMapping("/gerente")
public class GerenteController {
	
	@Autowired
	private DesenvolvedorService service;
	
	@RequestMapping("/iniciar")
	public String iniciarGerente(Model model){
		return "/gerente/iniciar";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newGerente(Model model){
		List<Desenvolvedor> devs = service.findAll();
		Project pro = new Project();
		pro.setDesenvolvedores(devs);
		model.addAttribute("project", pro);
		return "/project/new";
		
	}
	
	@RequestMapping("/reports")
	public String gerenteReports(){
		return "/reports/report";
	}

}
