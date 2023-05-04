class Main {
  public static void main(String[] args) {
    String name;
    String email;

    System.out.println("[ === Bank Teller App === ]");
  
    System.out.println("What is your name: ");
    name = Utils.getUserInputString();

    System.out.println("What if your email address: ");
    email = Utils.getUserInputString();

    Utils.clearScreen();

    Checking myChecking = new Checking();
    Savings mySavings = new Savings();


    // Transactions
    myChecking.deposit(1000);
    myChecking.withdraw(100);
    mySavings.deposit(2000);
    mySavings.withdraw(50);
    
    //Print Results
    System.out.println("[ --- Account Details for "+name+" --- ]");
    System.out.println("Checking balance: $"+myChecking.getRemainingBalance());
    System.out.println("Savings balance: $"+mySavings.getRemainingBalance());
    System.out.println("Savings interest rate: "+mySavings.getInterestRate()+"%");
  }
}