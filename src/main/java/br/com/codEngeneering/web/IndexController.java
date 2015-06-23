package br.com.codEngeneering.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.codEngeneering.user.User;
import br.com.codEngeneering.user.UserService;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Model model){
		model.addAttribute("user", new User());
		model.addAttribute("Erros", "");
		return "/iniciar";	
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String loginLoad(Model model, User user, BindingResult br){
		if(!br.hasErrors()){
			List<User> users = service.findAll();
			for(User u: users){
				if(u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())){
					if(u.getType() == 0){						
						return "redirect:/gerente/iniciar"; 
					}else{
						return "redirect:/developer/iniciar"; 
					}
				}
			}
			
		}
		model.addAttribute("Erros", "Usuário ou Senha Incorretos");
		return "/iniciar";
		
	}
	
	

}
