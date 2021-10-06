package algoritmos;

public class BurbujaMain {

    public static void main(String[] args) {
       BurbujaOrdenar ordenar= new BurbujaOrdenar();
        double r[]={2,1,5,4,8};
        System.out.println("Arreglo ordenado");
        ordenar.burbuja(r);
        int k;//Crear varibale local. Ya que alterariamos los valores anteriores.
    for(k=0; k<r.length; k++){
           System.out.print("["+r[k]+"]"); 
}
        
}
    }