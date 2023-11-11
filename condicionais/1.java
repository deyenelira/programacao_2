 import java.util.Scanner;
//  Faça um programa que receba dois números e mostre o maior deles. Caso eles sejam iguais, deve-se mostrar a mensagem "Os números são iguais".
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double a = in.nextDouble();
    double b = in.nextDouble();

    if (a > b) {
      System.out.println(a);
    } else {
      if (a == b) {
        System.out.println("Os números são iguais");
      } else {
        System.out.println(b);
      }
    }
  }
}
