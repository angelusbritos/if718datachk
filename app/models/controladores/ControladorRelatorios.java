package models.controladores;

import java.util.ArrayList;
import java.util.List;

import models.cadastros.*;

public class ControladorRelatorios{

	private CadastroPecas cadastroP;
	private CadastroComputadores cadastroC;
	private CadastroDoacoes cadastroD;

	public ControladorRelatorios(){
		cadastroD = new CadastroDoacoes();
		cadastroP = new CadastroPecas();
		cadastroC = new CadastroComputadores();
	}

	public String gerarRelatorio(){
		//TODO
		return "Relatorio!";
	}
}
