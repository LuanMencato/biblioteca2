package app.entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity

public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	private String ISSN;
	private String titulo;
	private String sinopse;
	private String ano;
	private String numeropaginas;
	
    @ManyToMany(mappedBy = "livros")
    private Set<Autor> autores = new HashSet<>();

    @ManyToOne
    private Editora editora;

    @ManyToOne
    private Biblioteca biblioteca;

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	}

