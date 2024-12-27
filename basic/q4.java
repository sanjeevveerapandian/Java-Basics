
import java.util.Scanner;

class q4{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    int score = scan.nextInt();
    scan.nextLine();
    String department =scan.nextLine();

    System.out.println("my name is "+name);
    System.out.println("my score is "+score +"%");
    System.out.println("my dept is "+department);

  }
}