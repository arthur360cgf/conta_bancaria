public class Account {
  private String name;
  private float value;
  private int numAccount;
  private int withdraw;
  
  public Account(String name, float value, int numAccount, int withdraw){
    this.name = name;
    this.value = value;
    this.numAccount = numAccount;
    this.withdraw = withdraw;

  }
  
  void statement(){
    System.out.println("Name:"+name+"/n"+"Value in account:"+value+"n/"+"Account number:"+numAccount);
  }
  public float Money(int withdraw){
    float y = value - withdraw;

    if (value >= withdraw){
      value = y;

    }

    return y;

  }
}
