package app.entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Entity

public class Biblioteca {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nome;
	private String telefone;

	@OneToMany(mappedBy = "biblioteca")
	private Set<Livro> livros = new HashSet<>();
}
