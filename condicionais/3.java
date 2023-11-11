import java.util.Scanner;

// Faça um programa que receba um número inteiro e verifique se esse número é par ou ímpar.
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();

    System.out.printf("%d é %s", a, ((a % 2 == 0) ? "par" : "impar"));
  }
}
