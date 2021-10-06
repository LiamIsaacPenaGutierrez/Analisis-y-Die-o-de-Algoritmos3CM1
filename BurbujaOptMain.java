/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author isaac
 */
public class BurbujaOptMain {

    public static void main(String[] args) {
      int [] arr= {1,6,4,7};
     BurbujaOptimizada ordenar= new BurbujaOptimizada();
        ordenar.BurbujaOpt(arr);
        ordenar.mostrarArre(arr);
    }
    
}//Fin del main
