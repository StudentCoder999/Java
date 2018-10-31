import java.util.Scanner;

public class LuxuryVehicleTest {
  static Vehicle v1;
  static LuxuryVehicle v1x;

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("# Of Warranty Years (Between 3-10): ");
      int warranty = input.nextInt();

      while((warranty > 10) || (warranty < 3)) {
        System.out.print("ERROR: INVALID, PLEASE TRY AGAIN.\n");
        System.out.print("Please Enter # Of Warranty Years Between 3 And 10: ");
        warranty = input.nextInt();
      }

      System.out.print("# Of Roadside Assistance Years: (Between 3-10): ");
      int roadassist = input.nextInt();

      while((roadassist > 10) || (roadassist < 3)) {
        System.out.print("ERROR: INVALID, PLEASE TRY AGAIN.\n");
        System.out.print("Please Enter # Of Roadside Assistance Years Between 3 And 10: ");
        roadassist = input.nextInt();
      }

      System.out.print("Wifi Option: (NO = 0, YES = 1) ");
      int wifi = input.nextInt();

      while((wifi > 1) || (wifi < 0)) {
        System.out.print("ERROR: INVALID, PLEASE TRY AGAIN.\n");
        System.out.print("Please Enter # For Wifi Option: ");
        wifi = input.nextInt();
      }

      System.out.print("Self-Driving Option: (NO = 0, YES = 1) ");
      Scanner input2 = new Scanner(System.in);
      int selfdriving = input2.nextInt();

      while((selfdriving > 1) || (selfdriving < 0)) {
        System.out.print("ERROR: INVALID, PLEASE TRY AGAIN.\n");
        System.out.print("Please Enter # For Self-Driving Option: ");
        selfdriving = input.nextInt();
      }

      String warrantyString = Integer.toString(warranty);
      String roadassistString = Integer.toString(roadassist);
      // String wifiString = Integer.toString(wifi);
      String selfdrivingString = Integer.toString(selfdriving);

      Vehicle v1 = new Vehicle(warrantyString, roadassistString, wifi, selfdrivingString);
      Vehicle v2 = new Vehicle("Mercedes-Benz", "C-Class", 2019, "1");
      v1.toString();
      v2.toString();
      System.out.print(v1.toString());
      System.out.print(v2.toString());

      LuxuryVehicle v1x = new LuxuryVehicle(warranty, roadassist, wifi, selfdriving);
      LuxuryVehicle v2x = new LuxuryVehicle(5, 5, 1, 1);
      v1x.toString();
      v2x.toString();
      System.out.print(v1x.toString());
      System.out.print(v2x.toString());
  }
}
