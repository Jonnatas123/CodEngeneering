package br.com.codEngeneering.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.codEngeneering.desenvolvedor.Desenvolvedor;
import br.com.codEngeneering.desenvolvedor.DesenvolvedorService;
import br.com.codEngeneering.user.User;

@Controller
@RequestMapping("/developer")
public class DeveloperController {
	
	@Autowired
	private DesenvolvedorService service;
	
	@RequestMapping(value = "/iniciar", method = RequestMethod.GET)
	public String devIniciar(){
		return "/developer/iniciar";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newDev(Model model){
		Desenvolvedor dev = new Desenvolvedor();
		model.addAttribute("desenvolvedor", dev);
		return "/developer/new";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String newDevPost(Model model, Desenvolvedor desenvolvedor, BindingResult br){
		if(!br.hasErrors()){			
			Desenvolvedor save = service.save(desenvolvedor);
			User user = new User();
			user.setUsername(desenvolvedor.getUsername());
			user.setPassword(desenvolvedor.getPassword());
			user.setType(1);
			user.setDev(save);
			return "redirect:/gerente/iniciar";
		}
		return "/developer/new";
	}
	
	@RequestMapping(value = "/analyze", method = RequestMethod.GET)
	public String analyze(Model model){
		return "/developer/scanner";
	}

}
