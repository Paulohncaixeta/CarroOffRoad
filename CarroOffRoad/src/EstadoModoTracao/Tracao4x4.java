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
public class Tracao4x4 implements EstadoModoTracao {

    @Override
    public void forcaTracao() {
        System.out.println("Veiculo mais forte na tracao");
    }

    @Override
    public void velocidadeMax() {
        System.out.println("Veiculo com velocidade final menor");
    }
    
}
