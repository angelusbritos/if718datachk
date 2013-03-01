package controllers;

import java.util.List;

import models.Fachada;
import models.entidades.*;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
	static Form<Computador> computadorForm = Form.form(Computador.class);

	public static Result index() {
		String user = session("connected");
		if(user != null)
			return ok(index.render(user));
		else
			return redirect(routes.Application.login());
	}

	public static Result login(){
		Form<Funcionario> fForm = Form.form(Funcionario.class).bindFromRequest();
		if(fForm.hasErrors()){
			return ok(login.render(fForm));
		}
		else{
			Funcionario f = fForm.get();
			session("connected", f.nome);
			return redirect(routes.Application.index());
		}
	}
  
	public static Result logout(){
		session().clear();
		return redirect(routes.Application.index());
	}
  
	public static Result computadores() {
		String user = session("connected");
		//return ok(lista.render(Computador.all(), computadorForm, user));
		return TODO;
	}

	public static Result newComputador() {
		String user = session("connected");
		return TODO;
	}

	public static Result deleteComputador(Long id) {
		String user = session("connected");
		return TODO;
	}

	public static Result funcionario(){
		String user = session("connected");
		return ok(funcionario.render());
	}

	public static Result pecas(){
		String user = session("connected");
		Fachada f = Fachada.getInstance();
		return ok(pecas.render(user, Form.form(Peca.class), f.pecas()));
	}

	public static Result novaPeca(){
		String user = session("connected");
		Form<Peca> pForm = Form.form(Peca.class).bindFromRequest();
		return ok(novaPeca.render(user, pForm));
	}
	
	public static Result cadastrarPeca(){
		String user = session("connected");
		Form<Peca> pForm = Form.form(Peca.class).bindFromRequest();

		if(pForm.hasErrors()){
			return ok(novaPeca.render(user, pForm));
		}
		else{
			Fachada fachada = Fachada.getInstance();
			Peca p = pForm.get();
			fachada.cadastrarPeca(pForm.get());
			return redirect(routes.Application.pecas());
		}
	}

	public static Result doacoes(){
		String user = session("connected");
		Fachada f = Fachada.getInstance();
		return ok(doacoes.render(user, Form.form(Doacao.class),  f.doacoes()));
	}

	public static Result cadastrarDoacoes(){
		Form<Doacao> dForm = Form.form(Doacao.class).bindFromRequest();
		Fachada fachada = Fachada.getInstance();
		fachada.cadastrarDoacoes(dForm.get());

		if(dForm.hasErrors()){
			//return ok(cadastrarDoacoes.render(user, pForm));
			return TODO;
		}
		else{
			Doacao d = dForm.get();
			return redirect(routes.Application.doacoes());
		}
	}
}
