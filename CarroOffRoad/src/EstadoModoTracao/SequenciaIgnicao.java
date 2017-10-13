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
public abstract class SequenciaIgnicao {
 
       public void SequenciaIgnicao(){

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

    abstract void andar();
    
}
