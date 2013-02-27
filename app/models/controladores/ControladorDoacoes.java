package models.controladores;

import java.util.ArrayList;
import java.util.List;

import models.cadastros.CadastroDoacoes;
import models.entidades.Doacao;

public class ControladorDoacoes{

	private CadastroDoacoes cadastro;

	public ControladorDoacoes(){
		cadastro = new CadastroDoacoes();
	}

	public Doacao getDoacao(long id){
		return cadastro.recuperar(id);
	}

	public List<Doacao> doacoes(){
		return cadastro.recuperar();
	}

	public void cadastrarDoacao(Doacao d){
		cadastro.atualizar(d);
	}
}
