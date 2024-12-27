import java.util.Scanner;
public class program2 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    char character=scanner.next().charAt(0);
    if (character>='A' && character<='Z')
    System.out.println("enter alphabet is a uppercase alphabet");

    else if(character >='a' &&  character<='z')
    System.out.println("entered alphabet is a lowercase alphabet");
  }
}
