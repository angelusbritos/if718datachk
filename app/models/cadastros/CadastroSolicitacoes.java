package models.cadastros;

import java.util.List;

import models.entidades.Solicitacao;
import models.repositorios.InterfaceRepositorios;
import models.repositorios.RepositorioSolicitacoesBDR;

public class CadastroSolicitacoes {

        public InterfaceRepositorios<Solicitacao> repSolicitacoes;

        public CadastroSolicitacoes(){
                repSolicitacoes = new RepositorioSolicitacoesBDR();
        }

        public void atualiar(Solicitacao sol){
		repSolicitacoes.save(sol);
        }

	public void remover(long id){
                if(repSolicitacoes.findId(id) != null){
                        repSolicitacoes.delete(id);
                }
        }


        public Solicitacao recuperar(long id){
                return repSolicitacoes.findId(id);
        }

        public List<Solicitacao> recuperar(){
                return repSolicitacoes.all();
        }
}
