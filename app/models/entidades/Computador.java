package models.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Computador extends Model{

	public Long id;
	
	@Required
	public String barcode;
	public String status;

	public static void create(Computador c) {
	}

	public static void delete(Computador c) {
	}

}
