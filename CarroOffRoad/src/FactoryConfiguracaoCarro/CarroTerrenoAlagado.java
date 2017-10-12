/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryConfiguracaoCarro;

/**
 *
 * @author Paulo
 */
public class CarroTerrenoAlagado extends ConfiguracaoCarro{
    
    @Override
    public void CalibragemPneus(){
        System.out.println("Pneu esta com calibragem mais alta");
    }
    
    @Override
    public void PosicaoEscapamento(){
        System.out.println("Saída do escapamento esta acima da cabine");
    
    }
    
}
