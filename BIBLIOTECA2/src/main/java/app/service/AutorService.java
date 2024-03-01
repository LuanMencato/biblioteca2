package app.service;

import java.util.ArrayList;
import java.util.List;

import app.entity.Autor;

public class AutorService {

	List<Autor> lista = new ArrayList<>();

	public String save(Autor autor) {
		lista.add(autor);
		return autor.getNome()+ " salvo";
	}

	public String update(long id, Autor autor) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == id) {
					lista.set(i, autor);
					return autor.getNome()+ " alterado!";
				}
			}

		return "Nao encontrado";
	}

	public List<Autor> listAll(){


		return lista;

	}

	public Autor findById(long idAutor) {


		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idAutor) {
					return lista.get(i);
				}
			}

		return null;

	}

	public String delete(long idAutor) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idAutor) {
					lista.remove(lista.get(i));
					return "Deletado";
				}
			}

		return "Nao encontrado";

	}


}
