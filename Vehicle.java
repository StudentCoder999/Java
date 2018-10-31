public class Vehicle {
  private String make;
  private String model;
  private int year;
  private String color;

  public Vehicle(String make, String model, int year, String color) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
  }

  private String getMake() {
    return make;
  }
  private void setMake(String make) {
    this.make = make;
  }

  private String getModel() {
    return model;
  }
  private void setModel(String model) {
    this.model = model;
  }

  private int getYear() {
    return year;
  }
  private void setYear(int year) {
    this.year = year;
  }

  private String getColor() {
    return color;
  }
  private void setColor(String color) {
    this.color = color;
  }

  public String toString() {
    return
    "\nMake of Vehicle: " + getMake() +
    "\nModel of Vehicle: " + getModel() +
    "\nYear of Vehicle: " + getYear() +
    "\nColor of Vehicle: " + getColor() +
    "\n ";
  }
}

enum Color {
  SILVER(0), RED(1), BLUE(2), GREEN(3), YELLOW(4), BLACK(5), WHITE(6);

  private int value = 0; // = 0 Default
  private Color() {}
  private Color(int i){ this.value = i; }

  public void printValue() {
  	System.out.println(this.value);
  }
}
