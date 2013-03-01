package models.entidades;
 
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Peca extends Model{
	
	@Id
	public long id;
	/*
	 * tipo
	 * * HD:
	 * * * capacidade
	 * * * rpm
	 * * Memoria:
	 * * * capacidade
	 * * * velocidade
	 * * Placa Mae:
	 * * * qtt Slot PCI
	 * * * qtt Slot PCIe
	 * * * qtt bar IDE
	 * * * qtt bar Sata
	 * * * qtt usb
	 * marca
	 * * modelo
	 * estado
	 * data
	 */
	//public TipoPeca tipo;
	//public MarcaPeca marca;
	//public ModeloPeca modelo;
	
	@Required
	public String tipo;
	public String marca;
	public String modelo;
	public String estado;

	@Override
	public String toString(){
		return 	"Peca["+id+"]: Tipo="+tipo+
			", marca="+marca+", modelo="+modelo+
			", estado="+estado+";";
	}
}
