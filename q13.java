class Wallet{
  public static void main(String args[]){
    int balance = 2500;
    int transfer =300;
    int deposit =500;
    balance=balance-transfer+deposit;
    System.out.println(balance);
  }
}