import java.util.Scanner;

public class program1 {
  public static void main(String args[]) {
    Scanner S = new Scanner(System.in); 
    System.out.println("Enter a number");
    int num = S.nextInt();

    //logic
    switch (num%2) {
      case 0 :System.out.println(num + "is even");
         break;
      case 1 :System.out.println(num + "is odd");
    }
  }
}
