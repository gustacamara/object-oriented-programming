public class MinhaLoja {
  public static void main(String[] args) {
    System.out.println("massdfasdfasdf");
    // using firstsmartphone
    Smartphone firstSmartphone = new Smartphone("A72", "Samsung", 5.6f, 0.270f, 6, "black", "USB-C");

    firstSmartphone.turnOn();
    firstSmartphone.volumeDown();
    firstSmartphone.takePhoto();
    firstSmartphone.volumeDown();
    firstSmartphone.takePhoto();
    firstSmartphone.turnOff();
    firstSmartphone.turnOn();
    firstSmartphone.volumeUp();
    firstSmartphone.turnOff();

    // using secondSmartphone
    Smartphone secondSmartphone = new Smartphone("J7", "Samsung", 4.2f, 0.200f, 2, "Gold", "micro-USB");

    secondSmartphone.turnOn();
    secondSmartphone.typePassword("14562");
    secondSmartphone.turnOn();
    secondSmartphone.typePassword("1234");
    secondSmartphone.takePhoto();
    secondSmartphone.turnOff();

    // using iphone

    Smartphone iphone = new Smartphone("IPhone15", "Apple", 4.7f, 0.270f, 4, "gray", "USB-C");

    // Smartphone iphone = new Smartphone("", "", 2f, 2f, 2, "", "");

    iphone.turnOn();
    iphone.typePassword("9090");
    iphone.turnOn();
    iphone.typePassword("1324");
    iphone.turnOn();
    iphone.typePassword("1234");
    iphone.turnOff();
  } 
}
