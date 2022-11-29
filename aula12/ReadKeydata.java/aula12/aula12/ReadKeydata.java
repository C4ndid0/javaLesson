
import java.util.Scanner;

public class ReadKeydata {

  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Digite su nombre:");
      String name = scan.nextLine();
      System.out.println("su nombre é:" + name);
    }

  }
}