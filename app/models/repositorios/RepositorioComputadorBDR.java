package models.repositorios;

import java.util.List;

import models.entidades.Computador;
import play.db.ebean.Model.Finder;

public class RepositorioComputadorBDR implements InterfaceRepositorios<Computador> {

	private Finder<Long, Computador> finder;

	public RepositorioComputadorBDR(){
		finder = new Finder<Long, Computador>(Long.class, Computador.class);
	}

	public List<Computador> all(){
		return finder.all();
	}

	public Computador findId(long id){
		return finder.byId(id);
	}

	public void save(Computador computador){
		computador.save();
	}

	public void delete(long id){
		finder.ref(id).delete();
	}

} 
