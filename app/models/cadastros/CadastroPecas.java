package models.cadastros;

import java.util.List;

import models.entidades.Peca;
import models.repositorios.InterfaceRepositorios;
import models.repositorios.RepositorioPecasBDR;

public class CadastroPecas {

        public InterfaceRepositorios<Peca> repPecas;

        public CadastroPecas(){
                repPecas = new RepositorioPecasBDR();
        }

        public void atualizar(Peca peca){
		repPecas.save(peca);
        }

	public void remover(long id){
                if(repPecas.findId(id) != null){
                        repPecas.delete(id);
                }
        }

        public Peca recuperar(long id){
                return repPecas.findId(id);
        }

        public List<Peca> recuperar(){
                return repPecas.all();
        }
}
