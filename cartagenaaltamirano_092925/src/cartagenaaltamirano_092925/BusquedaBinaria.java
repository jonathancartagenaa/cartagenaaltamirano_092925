package cartagenaaltamirano_092925;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jonathan
 */
public class BusquedaBinaria {
    
     //METODO PARA REALIZAR UNA BUSQUEDA BINARIA DE UN ARREGLO UNIDIMENCIONAL
    public int buscarEnterArray(int [] arreglo, int valorBuscado){
        
        //SE DECLARA LAS VARIABLES  DE INICIO Y FIN
        int inicio = 0;
        int fin = arreglo.length;
        
        //SE REALIZA LA EJECUCIÓN DE BUSQUEDA MIENTRAS EL ARREGLO TENGA ALMENOS UN ELEMENTO
        while(inicio <= fin){
            
            //SE OBTIENE LA POSICIÓN DEL CENTRO DEL ARREGLO
            int medio = (inicio + fin)/2;
            
            //SE EVALUA SI EL ELEMENTO EN LA POSICION MEDIA ES IGUAL AL VALOR BUSCADO
            if(arreglo[medio] == valorBuscado){
                return medio;
            }else if (arreglo[medio] < valorBuscado){
                //SE EVALUA SI EL ELEMENTO EN LA POSICION MEDIA ES MENOR QUE EL VALOR BUSCADO
                inicio = medio + 1;
            }else{
                //SE DEDUCE QUE EL ELEMENTO ES MAYOR, POR LO TANTO EL FIN CAMBIA
                fin = medio -1;
            }
            
            
        }
        //SE DEVUELVE -1 CUANDO NO HAY VALORES ENCONTRADOS
        return -1;
    }
    
    
    //METODO PARA BUSCAR UN VALOR EN UNA MATRIZ
    public void buscarEnteroMatriz(int[][] matriz, int objetivo){
        
        //SE DECLARAN LAS FILAS Y LAS COLUMNAS PARA CONOCER LA DIMENSION DE LA MATRIZ
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        //SE ESTABLECE EL INICIO Y EL FIN DE LA MATRIZ
        int inicio = 0;
        
        //CANTIDAD TOTAL DE ELEMENTOS EN LA MATRIZ
        int fin = (filas * columnas) - 1;
        
        //BANDERA QUE INDICA SI EL VALOR FUE ENCONTRADO O NO EN LA MATRIZ
        boolean encontrado = false;
        
        //SE REALIZA UNA REPETICIÓN MIENTRAS LA MATRIZ POSEA AL MENOS UN ELEMENTO
        while(inicio <= fin){
            
            //SE DEDUCE EL PUNTO MEDIO DE LA MATRIZ
            int medio = (inicio + fin) / 2;
            
            //SE SIMULA EL ARREGLO BIDIMENSIONAL COMO UN ARREGLO UNIDIMENSIONAL
            int f = medio / columnas;//¿CUAL FILA ES? (CUANTAS FILAS COMPLETAS EXISTEN ANTES DEL PUNTO MEDIO)
            int c = medio % columnas;//¿CUAL COLUMNA ES? (POSICION EXACTA DE LA COLUMNA)
            
            //SE EVALUA SI EL VALOR BUSCADO SE ENCUENTRA EN LA POSICION MEDIA 
            if(matriz[f][c] == objetivo){
                System.out.println("En la matriz, el elemento esta en la posicion ["+ f +"] ["+ c +"]");
                
                //SE ESTABLECE LA BANDERA COMO VERDADERA DEBIDO A QUE, SE ENCONTRO EL VALOR BUSCADO
                encontrado = true;
                break;
            }else if(matriz[f][c] < objetivo){
                //SE EVALUA SI EL VALOR DEL PUNTO MEDIO ES MENOR QUE EL VALOR BUSCADO
                inicio = medio + 1;
            }else{
                //ENTONCES, EL VALOR DEL PUNTO MEDIO ENCONTRADO ES MAYOR
                fin = medio -1;
            }
        }//FIN DEL WHILE
        
        //SE EVALUA LA BANDERA POR SI ACASO NO SE ENCONTRÓ NINGUN VALOR
        if(encontrado == false){
            //SE IMPRIME LA SALIDA EN CONSOLA
            System.out.println("El elemento buscado no ha sido encontrado en la matriz");
        }
        
        
    }//FIN DEL METODO buscarEnteroMatriz
    
}
