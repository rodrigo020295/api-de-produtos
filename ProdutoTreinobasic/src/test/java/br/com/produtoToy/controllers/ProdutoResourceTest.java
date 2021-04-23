package br.com.produtoToy.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdutoResourceTest {

	public WebApplicationContext context;
	
	private MockMvc mvc;
	
	public void setup() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
		
	}
	
	@Test
	public void testaRequisicaoIdSucesso() throws Exception {
		String url = "/produto/1";
		this.mvc.perform(get(url))
		.andExpect(status().isOk())
		.andExpect((ResultMatcher) jsonPath("descricao",equals("Sandalia Havaiana")));
		
		
	}
	
	
}
