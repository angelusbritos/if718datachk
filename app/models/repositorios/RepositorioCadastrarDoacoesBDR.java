package models.repositorios;

import java.util.List;

import models.entidades.Doacao;
import play.db.ebean.Model.Finder;

public class RepositorioCadastrarDoacoesBDR implements InterfaceRepositorios<Doacao> {

	private Finder<Long, Doacao> doacaoFinder;

	public RepositorioCadastrarDoacoesBDR(){
		doacaoFinder = new Finder<Long, Doacao>(Long.class, Doacao.class);
	}

	public List<Doacao> all(){
		return doacaoFinder.all();
	}

	public Doacao findId(long id){
		return doacaoFinder.byId(id);
	}

	public void save(Doacao doacao){
		doacao.save();
	}

	public void delete(long id){
		doacaoFinder.ref(id).delete();
	}

} 
