package com.danielsilveira.projetolp.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/categorias")
@RestController
public class CategoriaResource {
	
	@GetMapping
	public String listar() {
		return "REST está funcionando!";
	}
}
