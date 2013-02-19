package models.repositorios;

import java.util.List;

import models.entidades.Solicitacao;
import play.db.ebean.Model.Finder;

public class RepositorioSolicitacoesBDR implements InterfaceRepositorios<Solicitacao> {

	private Finder<Long, Solicitacao> finder;

	public RepositorioSolicitacoesBDR(){
		finder = new Finder<Long, Solicitacao>(Long.class, Solicitacao.class);
	}

	public List<Solicitacao> all(){
		return finder.all();
	}

	public Solicitacao findId(long id){
		return finder.byId(id);
	}

	public void save(Solicitacao solicitacao){
		solicitacao.save();
	}

	public void delete(long id){
		finder.ref(id).delete();
	}

} 
