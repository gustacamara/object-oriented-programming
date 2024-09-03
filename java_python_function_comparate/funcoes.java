import java.util.Random;
import java.util.Scanner;

public class funcoes{
  public static int[] createRamdomList (int size){
    int[] myList = new int[size];
    Random rand = new Random();
    int maxSize = 50;
    for (int i = 0; i < size; i++){
      myList[i] = rand.nextInt(maxSize);
      }

    return myList;
  } 
  public static void typeOfNumberAndPrintln (int[] listName){
    for (int i = 0; i < listName.length; i++){
      if (listName[i] % 3 == 0){
        System.out.println(listName[i]+" - multiplo de 3");
      }else if (listName[i] % 2 == 0) {
        System.out.println(listName[i] + " - numero par");
      }else{
        System.out.println(listName[i] + " - numero impar");
        }
    }
  }
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Digite um numero para ser o tamanho da lista: ");
      int choose = scan.nextInt();
      typeOfNumberAndPrintln(createRamdomList(choose));
    }
  }
}