package com.nel.filmes.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class Filme {
	
	private Long codigo;
	private String titulo;
	private String descricao;

}
