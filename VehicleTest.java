import java.util.Scanner;

public class VehicleTest {
  static Vehicle v1;

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Make: ");
      String make = input.nextLine();

      System.out.print("Model: ");
      String model = input.nextLine();

      int year = 0;
      while((year > 2050) || (year < 1900)) {
        System.out.print("Year: (Between 1900-2050)");
        year = input.nextInt();
      }

      System.out.print("SILVER(0), RED(1), BLUE(2), GREEN(3), YELLOW(4), BLACK(5), WHITE(6)");
      System.out.print("\nChoose Color: ");

      Scanner input2 = new Scanner(System.in);
      String color = input2.nextLine();

      // for(Color color2: Color.values()){
      // 	color2.printValue();
      // }

      Color c = null;
    	if(color.equals("0")){c = Color.SILVER;}
    	if(color.equals("1")){c = Color.RED;}
      if(color.equals("2")){c = Color.BLUE;}
      if(color.equals("3")){c = Color.GREEN;}
      if(color.equals("4")){c = Color.YELLOW;}
      if(color.equals("5")){c = Color.BLACK;}
      if(color.equals("6")){c = Color.WHITE;}
      if(color.equals("7")){c = Color.SILVER;}
      System.out.print("\n");

      Vehicle v1 = new Vehicle(make, model, year, c.toString() );
      Vehicle v2 = new Vehicle("FORD", "F150", 1999, (color = "SILVER") );

      v1.toString();
      v2.toString();

      System.out.print(v1.toString());
      System.out.print(v2.toString());
  }
}
