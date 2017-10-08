/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veiculo;

import EstadoModoTracao.EstadoModoTracao;
import EstadoModoTracao.Tracao4x2;

/**
 *
 * @author Paulo
 */
public final class Veiculo {
    
    public EstadoModoTracao selecionaTracao;
    
    public void setEstadoModoTracao(EstadoModoTracao tracaoSelecionada){
        this.selecionaTracao=tracaoSelecionada;
    }
    
    public Veiculo(){

    setEstadoModoTracao(new Tracao4x2());
    }
    
    public void forcaTracao(){
        selecionaTracao.forcaTracao();
    }
    
    public void velocidadeMax(){
        selecionaTracao.velocidadeMax();
    }
    
   
}
