import java.util.Scanner;

// Desenvolva um algoritmo que receba dois números, calcule e mostre a multiplicação entre eles, se ambos forem iguais. Caso o primeiro seja maior que o segundo, mostre a subtração do primeiro pelo segundo. Caso contrário, mostre a soma entre os dois.

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Double a = in.nextDouble();
    Double b = in.nextDouble();

    if (a == b) {
      System.out.println(a * b);
    } else if (a > b) {
      System.out.println(a - b);
    } else {
      System.out.println(a + b);
    }
  }
}
