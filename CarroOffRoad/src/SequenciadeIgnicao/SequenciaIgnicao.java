/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SequenciadeIgnicao;

import EstadoModoTracao.EstadoModoTracao;

/**
 *
 * @author Paulo
 */
public abstract class SequenciaIgnicao {
    
    private EstadoModoTracao selecionaTracao;
    
    public void setEstadoModoTracao(EstadoModoTracao tracaoSelecionada){
        this.selecionaTracao=tracaoSelecionada;
    }
    
    public void SequenciaIgnicao(){
    posicionarNoVeiculo();
    selecionarTracaoVeiculo();
    ligarVeiculo();
    
    }

    private void posicionarNoVeiculo() {
        System.out.println("O motorista entrou no veiculo");
    
    }
    
    

    private void ligarVeiculo() {
        System.out.println("O motorista ligou o veiculo");
    }
    
    
    
     private void selecionaTracaoVeiculo() {
        
    
    }
    
}
