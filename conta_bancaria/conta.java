public class conta {
  private String name;
  private float value;
  private int numAccount;
  private int withdraw;
  
  public conta(String name, float value, int numAccount, int withdraw){
    this.name = name;
    this.value = value;
    this.numAccount = numAccount;
    this.withdraw = withdraw;

  }
  
  void extrato(){
    System.out.println("Name:"+name+"/n"+"Value in account:"+value+"n/"+"Account number:"+numAccount);
  }
  public float sacar(int withdraw){
    float y = value - withdraw;

    if (value >= withdraw){
      value = y;

    }

    return y;

  }
}