/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SensorCombustivel;

import java.util.ArrayList;
import TipodeCombustivel.TipodeCombustivel;

/**
 *
 * @author Paulo
 */
public class SensorCombustivel {
    
    ArrayList<TipodeCombustivel> CombustivelDetectado = new ArrayList();
    
    private String Carro = "Gasolina";
    
    public void addCarro(TipodeCombustivel foiDetectado){
        CombustivelDetectado.add(foiDetectado);
    
    }
    
    public void setCarro(String CarroOffRoad){
        System.out.println("Antes o carro estava abastecido com: " + this.Carro);
        this.Carro=CarroOffRoad;
                
        for (TipodeCombustivel o: CombustivelDetectado){
        o.notificaTipoCombutivel();
        
        }
    
    
    }
    
}
