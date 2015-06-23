package br.com.codEngeneering.project;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	
	private ProjectDAO dao;
	
	public Project save(Project project){
		return dao.save(project);
	}
	
	public Project findOne(Long id){
		return dao.findOne(id);
	}

	public List<Project> findAll(){
		return dao.findAll();
	}
}
