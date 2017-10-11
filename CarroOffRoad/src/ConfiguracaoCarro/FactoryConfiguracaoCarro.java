/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConfiguracaoCarro;

/**
 *
 * @author Paulo
 */
public class FactoryConfiguracaoCarro {
    
    public ConfiguracaoCarro defineConfiguracao(String tipoCarro){
        if (tipoCarro.equalsIgnoreCase("CarroTerrenoAlagado"))
            return new CarroTerrenoAlagado();
        
        if (tipoCarro.equalsIgnoreCase("CarroTerrenoArenoso"))
            return new CarroTerrenoArenoso();
                
        return new CarroTerrenoArenoso();  
    
    }
    
    }