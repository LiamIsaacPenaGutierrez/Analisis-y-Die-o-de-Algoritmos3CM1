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
public class BurbujaOptimizada {
    int aux, i, j;
    boolean cambios=false;
public void BurbujaOpt(int []arr){
    while (true)
{
    cambios=false;//Es necesario que se mantenga en falso.
for (i=1; i<arr.length;i++)
{
    if(arr[i]<arr[i-1]){
        aux= arr[i];
        arr[i]=arr[i-1];
        arr[i-1]=aux;
        cambios=true;
    }
}
if (cambios==false)//Si no se a realizado ningun cambio=que ya esta arreglado.
    break;//Para salir del While.
}
}
public void mostrarArre(int [] arr){
int k;//Crear varibale local. Ya que alterariamos los valores anteriores.
    for(k=0; k<arr.length; k++){
           System.out.print("["+arr[k]+"]"); 
}
    System.out.println();
}              
}  
