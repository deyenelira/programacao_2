import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Insira um numero:");
    int a = in.nextInt();
    int sum = 0;

    while (a != 0) {
      if (a > 0) {
        sum += 1;
      }
      System.out.println("Insira um numero:");
      a = in.nextInt();
    }
    System.out.println("Soma:");
    System.out.println(sum);
  }
}
