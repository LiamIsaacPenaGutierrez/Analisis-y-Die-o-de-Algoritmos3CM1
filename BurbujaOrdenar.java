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
public class BurbujaOrdenar implements Algoritmo{
    private double tiempo_inicial;
    private double tiempo_final;
    private double tiempo_total;
    private int intercambios;
    private int comparaciones;      
    int i, j;
public BurbujaOrdenar(){//Inicializar la variable
              i=0;
              j=0;
        this.tiempo_inicial = 0;
        this.tiempo_final = 0;
        this.tiempo_total = 0;
        this.comparaciones = 0;
        this.intercambios = 0;
                  }

public void burbuja(double [] arr){
    this.tiempo_inicial = System.currentTimeMillis();
for(i=0;i<(arr.length);i++){
           for(j=i+1;j<arr.length;j++){
               this.comparaciones++;
           if(arr[i]>arr[j]){
             double tmp= arr[i];
               arr[i]= arr[j];
               arr[j]= tmp;
               this.intercambios++;
           }
           }
       }
        //termina
          this.tiempo_final = System.currentTimeMillis();
          this.tiempo_total = this.tiempo_final - this.tiempo_inicial;
    }

    /**
     * @return the tiempo_total
     */
    @Override
    public double getTiempo_total() {
        return tiempo_total;
    }

    @Override
    public void ordenar(double[] arreglo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
