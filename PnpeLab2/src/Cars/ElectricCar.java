package Cars;

public class ElectricCar extends Car{
    private double batteryLevel;
    private double efficiency;

    public ElectricCar(String brand, int speed,int mileage, double batteryLevel, double efficiency){
        super(brand,speed,0,mileage);
        this.batteryLevel = batteryLevel;
        this.efficiency = efficiency;
    }

    public void charge() {
        batteryLevel = 100;
    }

    public void driveElectric(int distance) {
       setMileage(getMileage()+distance);
       batteryLevel-=efficiency * ((double)distance/100);

    }
    public double getBatteryLevel() {
        return batteryLevel;
    }

    public double getEfficiency() {
        return efficiency;
    }


}
