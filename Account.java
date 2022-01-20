import java.util.Scanner;
public class Account {
  private String name;
  private double value;
  private int numAccount;
  private double withdraw;
  
  Scanner sc = new Scanner(System.in);

  public Account(String name, double value, int numAccount, double withdraw){
    this.name = name;
    this.value = value;
    this.numAccount = numAccount;
    this.withdraw = withdraw;

  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public double getValue(){
    return value;
  }
  public void setValue(double value){
    this.value = value;
  }
  public int getNumAccount(){
    return numAccount;
  }
  public void setNumAccount(int numAccount){
    this.numAccount = numAccount;
  }
  public double getWithdraw(){
    return withdraw;
  }
  public void setWithdraw(double withdraw){
    this.withdraw = withdraw;
  }
  void statement(){
    System.out.println("Name:"+name+"/n"+"Value in account:"+value+"n/"+"Account number:"+numAccount);
  }
  public double Money(double withdraw){
    double y = value - withdraw;
    String answer;
    System.out.println("How many money you wanna drew?");
    withdraw = sc.nextDouble();
    if (value >= withdraw){
      while(answer == "Y"){
        value = y;
        System.out.println("You drew R$"+withdraw);
        System.out.println("Wanna make another withdraw? Y/N");
        answer = sc.next();
        return y;
      }
      return y;

    }

    return y;

  }
}
