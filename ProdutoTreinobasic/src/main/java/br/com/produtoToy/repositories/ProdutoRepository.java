package br.com.produtoToy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import antlr.collections.List;
import br.com.produtoToy.domains.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	
	//select p from Produto p where p.descricao like'%%'
	public List findByDescricaoContaining(@Param("descricao") String descricao);
	

}
