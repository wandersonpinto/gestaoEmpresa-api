package br.com.peraira.gestaoEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.peraira.gestaoEmpresa.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
