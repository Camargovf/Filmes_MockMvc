package com.nel.filmes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nel.filmes.model.Filme;
import com.nel.filmes.service.FilmeService;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
	
	@Autowired
	private FilmeService filmeService;
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Filme> obterFilme(@PathVariable Long codigo) {
		
		Filme filme = this.filmeService.obterFilme(codigo);
		
		if (filme == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(filme);
	}
}
