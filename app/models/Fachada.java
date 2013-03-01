package models;

import java.util.List;

import controllers.*;
import models.entidades.*;
import models.controladores.*;

public class Fachada {

	// Declare the defined Controllers	
	private ControladorPecas ctrlP;
	private ControladorComputadores ctrlC;
	private ControladorSolicitacoes ctrlS;
	private ControladorRelatorios ctrlR;
	private ControladorDoacoes ctrlD;

	// Create a self instance, that should not be recreated (singleton)
	private static Fachada instance; 

	// Constructor
	private Fachada(){
		ctrlP = new ControladorPecas();
		ctrlC = new ControladorComputadores();
		ctrlS = new ControladorSolicitacoes();
		ctrlR = new ControladorRelatorios();
		ctrlD = new ControladorDoacoes();
	}

	// Return this Facade instance	
	public static Fachada getInstance(){
		if(instance == null){
			instance = new Fachada();
		}
		return instance;
	}

	// Implements the Facade operations
	public void cadastrarPeca(Peca p){
		ctrlP.cadastrar(p);
	}
	
	public List<Peca> pecas(){
		return ctrlP.all();
	}
	
	public List<Doacao> doacoes(){
		return ctrlD.all();
	}

	public void cadastrarDoacoes(Doacao d){
		ctrlD.cadastrar(d);
	}
	// -----------------------------------------------------------------	
}
