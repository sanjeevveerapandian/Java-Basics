public class NumberExample{
  public static void main(String[] args){
    printNumber(1);
  }
  static void printNumber(int n){
    System.out.println(n);

    printNumber2(2);

  }
  static void printNumber2(int n){
    System.out.println(n);
    
    printNumber3(3);
  }
  static void printNumber3(int n){
    System.out.println(n);
  }

}