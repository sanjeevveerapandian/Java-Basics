import java.util.Scanner;

public class NoOfNotes {
  public static void main(String args[]){
    
    Scanner scanner = new Scanner(System.in);
    int amount=scanner.nextInt();
    int temp_amount=amount;

    if (temp_amount>=200) {
      int noof500notes=temp_amount/500;
      temp_amount%500;
    }
    if (temp_amount>=200) {
      int noof500notes=temp_amount/200;
    }
    if (temp_amount>=500) {
      int noof500notes=temp_amount/500;
      temp_amount%500;
    }
  }
}
