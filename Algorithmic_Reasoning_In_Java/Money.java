import java.util.Scanner;
// Uma empresa de câmbio permite a compra de dólares, libras e euros. Elabore um
// algoritmo que leia o código da moeda que o cliente quer comprar e qual o montante
// que ele quer adquirir nessa moeda. Mostre então quanto ele deverá pagar em reais
// para concretizar a operação. Além da cotação, a empresa cobra uma comissão de 5%
// (quando o valor for menor que R$ 1.000), ou de 3% (quando maior ou igual a
// R$1.000).

// ler codigo moeda {dólares; libras; euros;}x
// quanto devera pagar pra adquirir a quantidade desejada da moeda
// cobra taxa de 5% se x < R$1000
// cobra taxa de 3% se x > R$1000

public class Money{

  private static final Scanner scan = new Scanner(System.in);

  public static int ChooseCoin() throws IllegalArgumentException {
    int coin;
      System.out.println("""
                        Digite o index correspondente a uma moeda da qual quer adquirir:
                        1 - Libra
                        2 - Euros
                        3 - Dolares
                        """);
      coin = scan.nextInt();
        
        switch (coin) {
          case 1 -> System.out.println("Moeda selecionada foi 'Libra'.");
          case 2 -> System.out.println("Moeda selecionada foi 'Euro'.");
          case 3 -> System.out.println("Moeda selecionada foi 'Dolar'.");
          default -> System.out.println("Moeda invalida.");
        }
    return coin;
  }

  public static float ValuePaiment(int typeOfCoin){
    float totalValue;
    System.out.println("Digite quanto gostaria dessa moeda: ");
    totalValue = scan.nextInt();

    float tax;
    if (totalValue > 1000 ){
      tax = 1.03f;
    } else {
      tax = 1.05f;
    }
    
    switch (typeOfCoin) {
      case 1 -> totalValue = totalValue * tax * 7.30f;
      case 2 -> totalValue = totalValue * tax * 5.70f;
      case 3 -> totalValue = totalValue * tax * 6.22f;
      default -> throw new AssertionError();
    }
    return(totalValue);
  }

  public static void PrintTotalValue(float necessaryValue){
    System.out.println("Voce precisa de R$" + (necessaryValue));
  }

  public static void main(String[] args) {
    try (scan) {
      PrintTotalValue(ValuePaiment(ChooseCoin()));
    }
  }
}