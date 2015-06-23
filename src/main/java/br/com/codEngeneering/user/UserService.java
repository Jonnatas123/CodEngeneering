package br.com.codEngeneering.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserDAO dao;
	
	public User save(User user){
		return dao.save(user);
	}
	
	public User findOne(Long id){
		return dao.findOne(id);
	}
	
	public List<User> findAll(){
		return dao.findAll();
	}

}
