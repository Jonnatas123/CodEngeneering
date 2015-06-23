package br.com.codEngeneering.desenvolvedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesenvolvedorDAO extends JpaRepository<Desenvolvedor, Long>{

}
