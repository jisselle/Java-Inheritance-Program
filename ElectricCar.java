package edu.cscc;

public class ElectricCar extends Car {
    private int batterySize;

    public ElectricCar(String make, String model, int year, int batterySize) {
        super(make,model,year);
        this.batterySize = batterySize;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public void describe() {
        System.out.println("Brand: "+getMake()+"\nModel: "+getYear()+"\nYear: "+getYear()+"\nBattery size in kilowatt hours: " + this.batterySize);
    }

}
