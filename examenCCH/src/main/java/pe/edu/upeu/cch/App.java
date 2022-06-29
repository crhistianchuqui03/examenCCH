package pe.edu.upeu.cch;

import java.util.Scanner;

import pe.edu.upeu.cch.examen2cch.resolucionexamen;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Scanner leer=new Scanner(System.in);
        int n;
        System.out.println("introduzca el numero del algoritmo:");
        n=leer.nextInt();
        switch (n) {
            case 2: new resolucionexamen().resolucion2cch(); break;
            case 3: new resolucionexamen().resolucion3cch(); break;
            case 4: new resolucionexamen().resolucion4cch(); break;
            case 5: new resolucionexamen().resolucion5cch(); break;
            
            default: System.err.println("dicha  opcion no existe :("); break;
        }
       
    }
}
