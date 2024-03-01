package app.entity;

import lombok.Setter;
import lombok.Getter;

import java.util.HashSet;

import java.util.Set;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;

@Setter
@Getter
@AllArgsConstructor
@Entity

public class Editora {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private String endereco;
	private String telefone;
	
	@OneToMany(mappedBy = "editora")
    private Set<Livro> livros = new HashSet<>();

}
