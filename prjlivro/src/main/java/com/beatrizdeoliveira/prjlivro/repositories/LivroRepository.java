package com.beatrizdeoliveira.prjlivro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beatrizdeoliveira.prjlivro.entites.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	
	
}



