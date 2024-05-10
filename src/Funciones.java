import java.util.Scanner;

public class Funciones {
  public static void main(String[] args) {
    int op;
    do {
      op = mostrarMenu();

      switch (op) {
        case 1:
          sumar();
          break;
        case 2:
          restar();
          break;
        case 3:
          multiplicar();
          break;
        case 4:
          dividir();
          break;
        case 5:
          mostrar("Adios!");
          break;
        default:
          mostrar("Elige una opción correcta");
      }
      /*
      if (op == 1) {
        sumar();
      } else if (op == 2) {
        restar();
      } else if (op == 3) {
        multiplicar();
      } else if (op == 4) {
        dividir();
      } else if (op == 5){
        mostrar("Shiao!!");
      }*/
    } while (op != 5);

  }

  public static int mostrarMenu(){
    mostrar("Elige una opción de menú:");
    mostrar("1. Sumar");
    mostrar("2. Restar");
    mostrar("3. Multiplicar");
    mostrar("4. Dividir");
    mostrar("5. Salir");
    return leerValorNumerico("Elige una opción");
  }

  public static void mostrar(String mensaje) {
    System.out.println(mensaje);
  }

  public static int leerValorNumerico(String mensaje) {
    mostrar(mensaje);
    Scanner sc = new Scanner(System.in);
    int op = sc.nextInt();
    return op;
  }

  public static void sumar(){
    int n1 = leerValorNumerico("Ingresa un número:");
    int n2 = leerValorNumerico("Ingresa otro número:");
    mostrar(String.format("El resultado de %d + %d es %d", n1, n2, n1 + n2));
  }
  public static void restar(){
    int n1 = leerValorNumerico("Ingresa un número:");
    int n2 = leerValorNumerico("Ingresa otro número:");
    mostrar(String.format("El resultado de %d - %d es %d", n1, n2, n1 - n2));
  }
  public static void multiplicar() {
    int n1 = leerValorNumerico("Ingresa un número:");
    int n2 = leerValorNumerico("Ingresa otro número:");
    mostrar(String.format("El resultado de %d * %d es %d", n1, n2, n1 * n2));
  }
  public static void dividir() {
    int n1 = leerValorNumerico("Ingresa un número:");
    int n2 = leerValorNumerico("Ingresa otro número:");
    mostrar(String.format("El resultado de %d / %d es %d", n1, n2, n1 / n2));
  }

}
