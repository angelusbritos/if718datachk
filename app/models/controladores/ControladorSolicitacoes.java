package models.controladores;

import java.util.ArrayList;
import java.util.List;

import models.cadastros.CadastroSolicitacoes;
import models.entidades.Solicitacao;

public class ControladorSolicitacoes{

	private CadastroSolicitacoes cadastro;

	public ControladorSolicitacoes(){
		cadastro = new CadastroSolicitacoes();
	}

	public Solicitacao get(long id){
		return cadastro.recuperar(id);
	}

	public List<Solicitacao> doacoes(){
		return cadastro.recuperar();
	}

	public void cadastrar(Solicitacao d){
		cadastro.atualizar(d);
	}
}
