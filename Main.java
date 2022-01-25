import java.util.Scanner;
import java.util.Random;
public class Main{

  public static void main(String[] args){
    String name;
    double initial;
    Scanner sc = new Scanner(System.in);
    Random number = new Random();
    int numAccount = 1 + number.nextInt(9999);

    //puting the initial data of client
    System.out.println("Singning up a new client ");
    System.out.println("Please put your name here: ");
    name = sc.nextLine();

    System.out.println("Put here the initial value in your account: ");
    initial = sc.nextDouble();

    //Creating new client account
    Account myAccount = new Account(name, numAccount, initial);
    myAccount.iniciate();
  }


}