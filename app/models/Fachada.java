package models;

import java.util.List;

import controllers.*;
import models.entidades.*;

public class Fachada {

	// Declare the defined Controllers	
	private ControladorPecas ctrlP;
	private ControladorComputador ctrlC;
	private ControladorSolicitacoes ctrlS;
	private ControladorRelatorio ctrlR;

	// Create a self instance, that should not be recreated (singleton)
	private static Fachada instance; 

	// Constructor
	private Fachada(){
		ctrlP = new ControladorPecas();
		ctrlC = new ControladorComputador();
		ctrlS = new ControladorSolicitacoes();
		ctrlR = new ControladorRelatorio();
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
	}
	// -----------------------------------------------------------------	
}
