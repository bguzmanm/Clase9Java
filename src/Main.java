import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la cantidad de asteriscos que quieres escribir:");
    int cantidad = sc.nextInt();

    for (int i = 1; i <= cantidad; i++) {

      if (i % 2 == 0){
        System.out.printf(".");
      } else {
        System.out.printf("*");
      }
    }

    System.out.println("");
  }
}