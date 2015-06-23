package br.com.codEngeneering.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.codEngeneering.desenvolvedor.DesenvolvedorService;
import br.com.codEngeneering.project.ProjectService;

@Controller
@RequestMapping("/reports")
public class ReportsController {
	
	@Autowired
	private ProjectService proService;
	
	@Autowired
	private DesenvolvedorService devService;
	
	@RequestMapping("/")
	public String reports(Model model){
		return "/reports/report";
	}

}
