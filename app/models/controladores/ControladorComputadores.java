package models.controladores;

import java.util.ArrayList;
import java.util.List;

import models.cadastros.CadastroPecas;
import models.cadastros.CadastroComputadores;
import models.entidades.Peca;
import models.entidades.Computador;

public class ControladorComputadores{

	private CadastroPecas cadastroP;
	private CadastroComputadores cadastroC;

	public ControladorComputadores(){
		cadastroP = new CadastroPecas();
		cadastroC = new CadastroComputadores();
	}

	public Computador getComputador(long id){
		return cadastroC.recuperar(id);
	}

	public List<Computador> all(){
		return cadastroC.recuperar();
	}

	public void cadastrar(Computador insert){
		cadastroC.atualizar(insert);
	}
}
