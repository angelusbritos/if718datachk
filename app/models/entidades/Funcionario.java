package models.entidades;
 
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Funcionario extends Model{
	public Long id;

	@Required
	public String email;
	public String password;
	public String nome;
	public String funcao;

	public void create(){
        }

        public static void delete(Long id){
        }

	public String validate(){
		if(authenticate(this.email, this.password) == null) return "Invalid email or password.";
		return null;
	}

	public String authenticate(String email, String password){
		if(email.equals("patolino"))        return null;
		else if(email.equals("pernalonga")) return null;
		else if(email.equals("gaguinho"))   return null;
		else return "Invalid email/password";
	}

	@Override
	public String toString(){
		return "Funcionario: [Nome=" + this.nome + ", email=" + this.email + ", Funcao=" + this.funcao + "]";
	}
}
