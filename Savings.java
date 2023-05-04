class Checking {
  public double balance;

  public Checking() {
    balance = Utils.getRandomDoubleNumber(100000, 500000);
  }

  public void withdraw(double amount){
    balance -= amount;
  }

  public void deposit(double amount){
    balance += amount;
  }

  public double getRemainingBalance(){
    return (double) Math.round(balance * 100d)/100d;
  }
}