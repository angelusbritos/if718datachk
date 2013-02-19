package models.cadastros;

import java.util.List;

import models.entidades.Computador;
import models.repositorios.InterfaceRepositorios;
import models.repositorios.RepositorioComputadorBDR;

public class CadastroComputador {

        public InterfaceRepositorios<Computador> repComputador;

        public CadastroComputador(){
                repComputador = new RepositorioComputadorBDR();
        }

        public void atualiar(Computador pc){
		repComputador.save(pc);
        }

	public void remover(long id){
                if(repComputador.findId(id) != null){
                        repComputador.delete(id);
                }
        }


        public Computador recuperar(long id){
                return repComputador.findId(id);
        }

        public List<Computador> recuperar(){
                return repComputador.all();
        }
}
