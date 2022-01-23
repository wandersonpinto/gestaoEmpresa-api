package br.com.peraira.gestaoEmpresa.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.peraira.gestaoEmpresa.domain.Categoria;
import br.com.peraira.gestaoEmpresa.domain.Livro;
import br.com.peraira.gestaoEmpresa.repositories.CategoriaRepository;
import br.com.peraira.gestaoEmpresa.repositories.LivroRepository;

@Service
public class DBService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informatica", "Livro de TI");
		Livro l1 = new Livro(null, "Clean Code", "Robert", "Lorem ipsum", cat1);
		cat1.getLivros().addAll(Arrays.asList(l1));

		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));
	}
}
