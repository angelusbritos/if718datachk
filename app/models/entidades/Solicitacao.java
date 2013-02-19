package models.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Solicitacao extends Model{

	long id;
	Funcionario manutencao;
	Funcionario estoque;
	String status;
	//Pecas pecas;
}
