package pe.edu.upeu.cch.examen2cch;

import java.util.Scanner;

public class resolucionexamen {
  static Scanner leer = new Scanner(System.in);

  public void resolucion2cch() {
    int i, n = 3;
    double cate1, cate2, cate3, clave, costo;
    double impuesto, impuestopagar;
    cate1 = 0;
    cate2 = 0;
    cate3 = 0;
    impuestopagar = 0;
    System.out.print("ingrese el numero de autos: "); //datos de entrada y salida
    n = leer.nextInt();
    leer.nextLine();
    for (i = 1; i <= n; i++) {
      System.out.print("transcurso" + i);

      System.out.print("ingrese la categoria 1-2-3 : ");
      clave = leer.nextDouble();

      leer.nextLine();
      System.out.print("ingrese el monto de costo del vehiculo: ");
      costo = leer.nextDouble();
      leer.nextLine();
      impuesto = 0;
      if (clave == 1) {
        impuesto = costo * 0.1;
        cate1 = cate1 + impuesto;
      }
      if (clave == 2) {
        impuesto = costo * 0.07;
        cate2 = cate2 + impuesto;
      }
      if (clave == 3) {
        impuesto = costo * 0.05;
        cate3 = cate3 + impuesto;
      }
      impuestopagar = impuestopagar + impuesto;
      System.out.println("total del impuesto: " + impuesto);
      System.out.println();
    }
    System.out.println("total del impuesto categoria 1: " + cate1);
    System.out.println("total del impuesto categoria 2: " + cate2);
    System.out.println("total del impuesto 3: " + cate3);
    System.out.println("total a pagar del impuesto es de : " + impuestopagar);
  }

  public void resolucion3cch() {
    int n;
    System.out.print("ingrese la altura de la X:");
    n = leer.nextInt();
    if (n >= 3 && n % 2 == 1) {
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
          if (i == j || i + j == n + 1) System.out.print(
            "*"
          ); else System.out.print(" ");
        }
        System.out.println();
      }
    } else {
      System.out.println("no es valido :(");
    }
  }

  public void resolucion4cch() {
    //definir variables
    int i;
    int j;
    int suma;
    int cat = 0;
    //datos entrada proceso y salida
    System.out.print( "introdusca la cantidad de numeros perfectos que desea observar: ");
    int canti = leer.nextInt();
    System.out.println("Los numero perfectos son: ");
    for (i = 1; i > 0; i++) {
      suma = 0;
      for (j = 1; j < i; j++) {
        if (i % j == 0) {
          suma = suma + j;
        }
      }
      if (i == suma) {
        cat++;
        if (cat <= canti) {
          System.out.println(i);
        } else {
          break;
        }
      }
    }
  }

  public void resolucion5cch() {
    int n;
    do {
      System.out.print("ingrese el dato decimal:");
      n = leer.nextInt();
    } while (n < 0);
    System.out.println();
    System.out.print(" respuesta dado a binario:");
    cch(n);
    System.out.println();
  }

  public static void cch(int n) {
    if (n < 2) {
      System.out.print(n);
      return;
    } else {
      cch(n / 2);
      System.out.print(n % 2);
      return;
    }
  }
}
