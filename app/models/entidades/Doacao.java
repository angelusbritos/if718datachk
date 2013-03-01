package models.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Doacao extends Model{

	@Id
	long id;

	@Required
	public String origem;

	public String comentarios;

	public int qttPlacaMae;
	public int qttPlacaVideo;
	public int qttPlacaRede;
	public int qttMemoria;
	public int qttMonitor;
	public int qttGabinete;
	public int qttHD;
	public int qttDriveCD;
	public int qttTeclado;
	public int qttMouse;
	public int qttImpressora;

	@Override
	public String toString(){
		return "Doacao[" + id +"]:/nOrigem="+origem+
					 "/nqttPlacaMae"+qttPlacaMae+
					 "/nqttPlacaVideo"+qttPlacaVideo+
					 "... Comentarios:"+comentarios;
	}
}
