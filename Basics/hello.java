package Basics;
class hello{
  public static void main(String args[])
  {
    System.out.print("Hello World");
  }
}

/*english -> bite code -> jvm code -> machine readable code  */



// Variables and DataTypes

 class hello{
 public static void main(String args[])
 {
 String container = "fish";
 int box = 67;
System.out.println(container);
System.out.println(box);
 }
}
 

class hello{
  public static void main(String args[])
  {
    int a = 80;
    int b = 20;
    int c = 10;
    System.out.println(a + b - c);
  }
}

//System.out.print() 
//that system is coming from java.lang.System;
//where the system is connected to terminal or server

import java.lang.System;
import java.util.Scanner;
class hello{
public static void main(String args[])
{
Scanner john = new Scanner(System.in);
int a = john.nextInt();
System.out.print(a);
}
}
//takes the value entered at terminal and stores it in a , prints a
