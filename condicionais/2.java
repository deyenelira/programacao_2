import java.util.Scanner;

// Desenvolva um algoritmo que receba três números. O algoritmo deve imprimir "Condição satisfeita", na tela, caso o primeiro dado inserido seja maior do que os outros dois (o primeiro não pode ser igual a nenhum). Caso contrário, deve ser impressa a mensagem: "Erro".
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double a = in.nextDouble();
    double b = in.nextDouble();
    double c = in.nextDouble();

    if (a > b && a > c) {
      System.out.println("Condição satisfeita");
     }else{
      System.out.println("Erro");
     }
  }
}
