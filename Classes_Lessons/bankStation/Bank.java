public class Bank {
  private Client person;
  private double accountBalance = 0;
  private double creditCard = 0;
  private double creditCardLimit = 600;

  // constructor
  public Bank(Client person) {
    this.person = person;
  }
  public Bank(Client person, double accountBalance, double accountDebit) {
    this.person = person;
    this.accountBalance = accountBalance;
  }

  // methods  
  public void buyOnCredit(double debitValue) {
    if (creditCard + debitValue <= creditCardLimit) {
      creditCard += debitValue;
    }else{
      System.out.println("Você não tem limite no seu cartão de debito!");
    }
  }

  public void buyOnDebt(double valueToPay) {
    if (accountBalance - valueToPay >= 0)accountBalance -= valueToPay;
  }
  
  public void payCreditCard(double paimentValue){
    if (creditCard + paimentValue >= 0){
      creditCard += paimentValue;
      if (creditCard == 0){
        System.out.println("Congratulations you paid off your entire credit card!");
      }else{
        System.out.println("""
                            You do not paid off your intire credit card.
                            Your current debt is: R$
                            """ + creditCard);
      }
    }
  }

  // setters
  public void setCreditLimit(double creditLimit) {
    creditLimit = creditCardLimit;
  }

  public void setAccountBalance(double accountBalance){
    this.accountBalance += accountBalance;
  }

  //getters 
  public double getCreditCardLimit(){
    return creditCardLimit;
  }

  public double getCreditCard(){
    return creditCard;
  }

  public double getAccountBalance(){
    return accountBalance;
  }
}