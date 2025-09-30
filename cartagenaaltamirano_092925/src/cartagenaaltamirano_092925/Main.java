/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartagenaaltamirano_092925;

/**
 *
 * @author Jonathan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //INSTANCIAMOS LA VARIABLE (REFERENCIA O PUNTERO)
        BusquedaBinaria buscar = new BusquedaBinaria();
        
        //SE ESTABLECE UN ARREGLO UNIDIMENSIONAL
        int[] arreglo = {17,19,21,23,25,27,29,31};
        
        int[][] matriz = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        
        //SE ESTABLECE UN VALOR A BUSCAR
        int a_buscar = 17;
        
        //SE IMPLEMENTA EL MÉTODO CORRESPONDIENTE A LA BÚSQUEDA DE VALORES EN
        //ARREGLOS UNIDIMENSIONALES Y MEDIANTE LA REFERENCIA SE REALIZA LA EJECUCIÓN
        //DEL METODO buscarEnterArray(), ENVIANDO LOS PARAMETROS NECESARIOS
        int posicion = buscar.buscarEnterArray(arreglo, a_buscar);
        
        //SE EVALUA EL RESULTADO DEVUELTO POR EL MÉTODO.
        if(posicion != -1){
            //SI ENCONTRÓ EL VALOR
            System.out.println("El valor "+a_buscar+" esta en la posicion: "+posicion);
        }else{
            //NO ENCONTRÓ EL VALOR
            System.out.println("No se encontro el valor de "+a_buscar);
        }
        
        //IMPLEMENTACION DEL METODO DE BUSQUEDA DE UNA MATRIZ
        buscar.buscarEnteroMatriz(matriz, a_buscar);
        
    }
    
}
