package com.alkemy.disney.characters.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity // indicamos que el objeto es una entidad
@Table(name = "genre") // indicamos que tabla va a utilizar
@Getter // automatizar getters con lombok
@Setter // automatizar setters  con lombok

public class GenreEntity {
	// columna ID
	@Id //indicamos que es un id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) // se genera secuencialmente (autoincremental)
	private Long id;
	
	private String name;
	private String img; //url de la imagen
	//private String filmID; //no lo declaramos, se declara la relacion en FilmEntity
}
