

public class Smartphone {
  public String model;
  public String brand; // marca ( samsung, iphone...)
  public String color;
  public String charger;
  public float screen; // polegadas
  public float weight;
  public int numCamera;
  public int volume = 3;
  public boolean screenON = false;

  // instance object
  public Smartphone(String model, String brand, float screen, float weight, int numCamera,
                    String color, String charger) {
    this.model = model;
    this.brand = brand;
    this.screen = screen;
    this.weight = weight;
    this.numCamera = numCamera;
    this.color = color;
    this.charger = charger;
  }
  // methods of object
  public void turnOn() {
    screenON = true;
    System.out.println("I'm ON");
  }
  public void turnOff() {
    screenON = false;
    System.out.println("I'm Off");
  }
  public void takePhoto() {
    if (screenON){
      System.out.println("Nice picture!");
    }
  }
  public void volumeUp() {
    if (screenON) {
      volume ++;
      System.out.println("Volume: " + volume);
    }
  }
  public void volumeDown() {
    if (screenON) {
      volume --;
      System.out.println("Volume: " + volume);
    } 
  }
  public void typePassword(String password) {
    if (screenON) {
      if (!password.equals("1234")){
        screenON = false;
        System.out.println("Incorrect password");
      }
    }
  }
}
