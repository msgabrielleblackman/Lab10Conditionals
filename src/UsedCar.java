/**
 * Created by Grand Circus Student on 7/23/2017.
 */
public class UsedCar extends Cars2 {

    protected double mileage;

    public UsedCar(String make, String model, int year, double price, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage =mileage;
    }
    public double getMileage() {
        return mileage;
    }

    public double setMileage() {
        return mileage;
    }
}
