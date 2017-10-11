/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SequenciadeIgnicao;

import EstadoModoTracao.EstadoModoTracao;
import Veiculo.Veiculo;

/**
 *
 * @author Paulo
 */
public abstract class SequenciaIgnicao {

    private EstadoModoTracao selecionaTracao;
    
    private Veiculo estadoVeiculo;

    public void setEstadoModoTracaoe(EstadoModoTracao tracao) {

        this.selecionaTracao = tracao;
    }

    public void SequenciaIgnicao() {
        posicionarNoVeiculo();
        ligarVeiculo();
        andar();
    }

    
    private void posicionarNoVeiculo() {
        System.out.println("O motorista entrou no veiculo");

    }

    private void ligarVeiculo() {
        System.out.println("O motorista ligou o veiculo");
    }

    private void andar() {
        
        selecionaTracao.forcaTracao();
        selecionaTracao.velocidadeMax();
    }

}
