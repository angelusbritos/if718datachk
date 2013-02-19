package models.repositorios;

import java.util.List;

import models.entidades.Peca;
import play.db.ebean.Model.Finder;

public class RepositorioPecasBDR implements InterfaceRepositorios<Peca> {

	private Finder<Long, Peca> finder;

	public RepositorioPecasBDR(){
		finder = new Finder<Long, Peca>(Long.class, Peca.class);
	}

	public List<Peca> all(){
		return finder.all();
	}

	public Peca findId(long id){
		return finder.byId(id);
	}

	public void save(Peca peca){
		peca.save();
	}

	public void delete(long id){
		finder.ref(id).delete();
	}

} 
