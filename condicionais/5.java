import java.util.Scanner;

// Desenvolva um algoritmo que simule uma calculadora. Você deve dar a opção de o usuário escolher entre: 1 - Somar; 2 - Subtrair; 3 - Multiplicar; 4 - Dividir. O usuário só conseguirá processar dois números inteiros por vez. Assuma a divisão por zero.

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite 1 - Somar; 2 - Subtrair; 3 - Multiplicar; 4 - Dividir");
    int a = in.nextInt();

    System.out.println("Informe os números:");
    Double b = in.nextDouble();
    Double c = in.nextDouble();

    if (a == 4 && c == 0) {
      System.out.println("Divisão por zero.");
    } else {
      System.out.println((a == 1) ? b + c : (a == 2) ? b - c : (a == 3) ? b * c : b / c);
    }
  }
}
