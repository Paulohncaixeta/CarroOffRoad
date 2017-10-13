/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorAcessoriosCarro;

/**
 *
 * @author Paulo
 */
public abstract class CarroOffRoadEspecial extends CarroOffRoadAcessorio {
    
    protected CarroOffRoadAcessorio acessorio;
    protected String descricao;
    
    
    
    public CarroOffRoadEspecial(CarroOffRoadAcessorio acessorio, String descricao) {
        this.acessorio = acessorio;
        this.descricao = descricao;
        
    }
    
    @Override
    public String getDescricao() {
        return descricao+", "+acessorio.getDescricao();
    }
    
   

    
}
