package models.cadastros;

import java.util.List;

import models.entidades.Doacao;
import models.repositorios.InterfaceRepositorios;
import models.repositorios.RepositorioCadastrarDoacoesBDR;

public class CadastroDoacoes {

        public InterfaceRepositorios<Doacao> repDoacoes;

        public CadastroDoacoes(){
                repDoacoes = new RepositorioCadastrarDoacoesBDR();
        }

        public void atualiar(Doacao doacao){
		repDoacoes.save(doacao);
        }

	public void remover(long id){
                if(repDoacoes.findId(id) != null){
                        repDoacoes.delete(id);
                }
        }


        public Doacao recuperar(long id){
                return repDoacoes.findId(id);
        }

        public List<Doacao> recuperar(){
                return repDoacoes.all();
        }
}
