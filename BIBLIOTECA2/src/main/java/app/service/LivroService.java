package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Livro;

@Service
public class LivroService {
	
	List<Livro> lista = new ArrayList<>();

	public String save(Livro livro) {
		lista.add(livro);
		return livro.getNome()+ " salvo";
	}

	public String update(long id, Livro livro) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, livro);
					return livro.getNome()+ " alterado!";
				}
			}

		return "Livro nao encontrado";
	}

	public List<Livro> listAll(){


		return lista;

	}

	public Livro findById(long idLivro) {


		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idLivro) {
					return lista.get(i);
				}
			}

		return null;

	}

	public String delete(long idLivro) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idLivro) {
					lista.remove(lista.get(i));
					return "Deletado";
				}
			}

		return "Livro nao encontrado";

	}

}
