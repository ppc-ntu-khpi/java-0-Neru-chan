public class Shirt {
  public int shirtID = 727; // стандартне значення номера моделі сорочки
  public String description = "100% cotton"; // стандартний опис сорочки
  // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
  
  //public char colorCode = 'U';
  public Color color = new Color(-12, 75, 255);

  public double price = 726.99; // стандартна вартість сорочки
  public int quantityInStock = 0; // стандартна кількість на складі
  
  // цей метод просто виводить всю інформацію про сорочку на екран
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description: " + description);

    //System.out.println("Color Code: " + colorCode);
    System.out.println("Color in HEX: " + color.getHEX());
    System.out.println("Color in RGB: " + color.getRGB());

    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // кінець методу displayShirtInformation
} // кінець опису класу

class Color {
  private int Red; 
  private int Green;
  private int Blue;

  Color(int Red, int Green, int Blue) {
    this.Red = (isRange(Red)) ? Red : 0;
    this.Green = (isRange(Green)) ? Green : 0;
    this.Blue = (isRange(Blue)) ? Blue : 0;
  }

  private boolean isRange(int number) {
    return (0 <= number) && (number <= 255); 
  }

  public String getHEX() {
    return
    '#' +
    Integer.toHexString(Red) +
    Integer.toHexString(Green) + 
    Integer.toHexString(Blue );
  }

  public String getRGB() {
    return
    "R: " + Red +
    " G: " + Green +
    " B: " + Blue;
  }
}