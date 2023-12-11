import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    boolean prime = true;

    for (int i = 2; i < a; i++) {
      if (a % i == 0)
        prime = false;
    }
    if (prime)
      System.out.println(a + " é primo");
    else
      System.out.println(a + " não é primo");
  }
}
