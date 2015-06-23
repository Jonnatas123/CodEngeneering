package br.com.codEngeneering.desenvolvedor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DesenvolvedorService {
	
	@Autowired
	private DesenvolvedorDAO dao;
	
	public Desenvolvedor save(Desenvolvedor dev){
		return dao.save(dev);
	}
	
	public Desenvolvedor findOne(Long id){
		return dao.findOne(id);
	}
	
	public List<Desenvolvedor> findAll(){
		return dao.findAll();
	}

}
