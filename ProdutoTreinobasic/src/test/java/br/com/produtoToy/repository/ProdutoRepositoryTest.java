package br.com.produtoToy.repository;



import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.produtoToy.domains.Produto;
import br.com.produtoToy.repositories.ProdutoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdutoRepositoryTest {

	
	@Autowired
	private ProdutoRepository repo;
	
	
	@Test
	public void testaProdutoHavaiana() {
		List<Produto> produtos =  (List<Produto>) repo.findByDescricaoContaining("Hava");
		assertThat(produtos.size()).isEqualTo(1);
		assertThat(produtos.get(0).getDescricao().equals("Sandalia Havaiana"));
	}
	
	public void testaProdutoSapato() {
		List <Produto> produtos = (List<Produto>) repo.findByDescricaoContaining("Sapato");
		assertThat(produtos.size()).isEqualTo(0);
	}
	
	
	
	
	
}
