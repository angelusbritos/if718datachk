package models.controladores;

import java.util.ArrayList;
import java.util.List;

import models.cadastros.CadastroPecas;
import models.entidades.Peca;

public class ControladorPecas{

	private CadastroPecas cadastro;

	public ControladorPecas(){
		cadastro = new CadastroPecas();
	}

	public Peca get(long id){
		return cadastro.recuperar(id);
	}

	public List<Peca> all(){
		return cadastro.recuperar();
	}

	public void cadastrar(Peca d){
		cadastro.atualizar(d);
	}
}
