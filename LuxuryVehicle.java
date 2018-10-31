public class LuxuryVehicle extends Vehicle {
  private int warranty;
  private int roadassist;
  private int wifi;
  private int selfdriving;

  public LuxuryVehicle(int warranty, int roadassist, int wifi, int selfdriving) {
    super(warranty, roadassist, wifi, selfdriving);
    // this.warranty = warranty;
    // this.roadassist = roadassist;
    // this.wifi = wifi;
    // this.selfdriving = selfdriving;
  }

  private int getWarranty() { return warranty; }
  private void setWarranty(int warranty) { this.warranty = warranty; }

  private int getRoadassist() { return roadassist; }
  private void setRoadassist(int roadassist) { this.roadassist = roadassist; }

  private int getWifi() { return wifi; }
  private void setWifi(int wifi) { this.wifi = wifi; }

  private int getSelfdriving() { return selfdriving; }
  private void setSelfdriving(int selfdriving) { this.selfdriving = selfdriving; }

  @Override
  public String toString() {
    String parentString = super.toString();
    return super.toString() + ", Warranty: " + warranty + ", Roadside Assistance: " + roadassist + ", Wifi: " + wifi + ", Self-Driving: " + selfdriving;
  }
}
