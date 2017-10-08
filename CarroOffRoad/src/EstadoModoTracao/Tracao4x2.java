/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoModoTracao;

/**
 *
 * @author Paulo
 */
public class Tracao4x2 implements EstadoModoTracao {

    @Override
    public void forcaTracao() {
        System.out.println("Veiculo mais fraco na tracao");
    }

    @Override
    public void velocidadeMax() {
        System.out.println("Veiculo com mais velocidade final");
    }
    
}
