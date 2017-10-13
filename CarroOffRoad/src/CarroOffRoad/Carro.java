/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarroOffRoad;

import DecoratorAcessoriosCarro.CarroOffRoad;
import DecoratorAcessoriosCarro.CarroOffRoadAcessorio;
import DecoratorAcessoriosCarro.FarolEspecial;
import DecoratorAcessoriosCarro.GradeLanterna;
import DecoratorAcessoriosCarro.LetreiroTintaNeon;
import EstadoModoTracao.SequenciaIgnicao;
import EstadoModoTracao.Tracao4x2;
import EstadoModoTracao.Tracao4x4;
import FactoryConfiguracaoCarro.ConfiguracaoCarro;
import FactoryConfiguracaoCarro.FactoryConfiguracaoCarro;
import SensorCombustivel.SensorCombustivel;
import TipodeCombustivel.CombustivelAlcool;

/**
 *
 * @author Paulo
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        CarroOffRoadAcessorio carro = new CarroOffRoad();
        carro = new GradeLanterna(carro);
        carro = new FarolEspecial(carro);
        carro = new LetreiroTintaNeon(carro);
        System.out.println("O carro foi decorado com:" + carro.getDescricao());
        
        SensorCombustivel sensor = new SensorCombustivel();
        sensor.addCarro(new CombustivelAlcool());
        sensor.setCarro("Alcool");
        
        FactoryConfiguracaoCarro factoryCarro = new FactoryConfiguracaoCarro();
        ConfiguracaoCarro carroConfiguracao = factoryCarro.defineConfiguracao("CarroTerrenoAlagado");    
        carroConfiguracao.CalibragemPneus();
        carroConfiguracao.PosicaoEscapamento();
        
        SequenciaIgnicao sair = new Tracao4x2();
        sair.SequenciaIgnicao();
       
       
        
        
        
        
        
        
       
                
    }
    
}
