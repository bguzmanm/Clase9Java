import java.util.Scanner;

public class Funciones2 {
  public static void main(String[] args) {

    int cantidad = leerValorNumerico("Cantidad:\n");
    int[] arr = nuevoArreglo(cantidad);
    mostrarArreglo(arr);
    ordenarMayorMenor(arr);


    mostrarArreglo(arr);


  }

  public static int[] nuevoArreglo(int largo){

    int[] arreglo = new int[largo];
    for (int i = 0; i < arreglo.length; i++) {
      arreglo[i] = (int)(Math.random() * 89 + 10);
    }

    return arreglo;
  }

  public static void mostrarArreglo(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      mostrar(String.format("[%d]", arr[i]));
    }
    mostrar("\n");
  }


  public static void mostrar(String mensaje) {
    System.out.printf(mensaje);
  }

  public static int leerValorNumerico(String mensaje) {
    mostrar(mensaje);
    Scanner sc = new Scanner(System.in);
    int op = sc.nextInt();
    return op;
  }

  public static void ordenarMayorMenor(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[i]<arr[j]){
          int aux = arr[i];
          arr[i] =arr[j];
          arr[j] = aux;
        }
      }
    }
  }

}
