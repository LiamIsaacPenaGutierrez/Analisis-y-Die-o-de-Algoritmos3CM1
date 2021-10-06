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
public class MezclaMain {

    public static void main(String[] args) {
       Mezcla ordenar= new Mezcla();
        double r[]={3,1,5,7,9};
        System.out.println("Ordenado");
        ordenar.ordenar(r);//Crear varibale local. Ya que alterariamos los valores anteriores.
    for(int x=0; x<r.length; x++){
           System.out.print("["+r[x]+"]"); 
}
}
}