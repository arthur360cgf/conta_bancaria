import java.util.Scanner;
public class Account {
  private String name;
  private double value;
  private int numAccount;
  private double withdraw;
  private double balance;
  
  Scanner sc = new Scanner(System.in);

  public Account(String name, int numAccount, double initial_value){
    this.name = name;
    this.value = initial_value;
    this.numAccount = numAccount;

  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public double getBalance(){
    return balance;
  }

  public void setBalance(double balance){
    this.balance = balance;
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
    System.out.println("Name:"+name+"\n"+"Value in account:"+value+"\n"+"Account number:"+numAccount);
  }

  public void extract(){
    System.out.println("\tEXTRACT");
    System.out.println("Name: "+ this.name);
    System.out.println("Account number: "+this.numAccount);
    System.out.println("teh balance in your account is: R$%.2f\n"+this.balance);
    System.out.println("Today you make a total of "+this.withdraw+" drews");
  }

  public void Money(double value){
  
    System.out.println("How many money you wanna drew?");
    withdraw = sc.nextDouble();
    if (balance >= value){
      balance -= value;
      withdraw++;        
        System.out.println("You drew R$"+value);
        System.out.println("New balance is: "+balance+"\n");
      
      }
      else{
        System.out.println("Its not possible make this operation because tha value of you account are less than you have in your account. Make a deposit or drew a smaler value");
       

      } 

  }

  public void deposit(double value){
    balance += value;
    System.out.println("How much you want to deposit?");
    value = sc.nextDouble();
    System.out.println("You make a deposit in a value of: R$"+value);

  }

  public void iniciate(){
    int option;
    do{
      showMenu();
      option = sc.nextInt();
      chooseOption(option);
    }while(option != 4);
  }

  public void showMenu(){
    System.out.println("\t Choose the option you want"); 
    System.out.println("1 - Consult Extract");
    System.out.println("2 - Withdraw"); 
    System.out.println("3 - Deposit");
    System.out.println("4 - Exit \n"); 
    System.out.println("Option: ");
    
  }

  public void chooseOption(int option){
    double value;

    switch(option){
      case 1:
        extract();
        break;
      case 2:
        if(withdraw < 3){
          System.out.println("How much you want drew: ");
          value = sc.nextDouble();
          Money(value);
        }
        else{
          System.out.println("You already reached your daily limit");
        }
      case 3:
        System.out.println("How much you want deposit: ");
        value = sc.nextDouble();
        deposit(value);
        break;

      case 4:
        System.out.println("Closing aplication, thanks for use");
      
      default:
        System.out.println("Invalid Option please select a valid option");

    }
  }

}
