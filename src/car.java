import java.util.Scanner;

/**
 * A class to record information
 * on a car
 *
 * @author A. Hamilton
 * @version 1.0
 */


public class car {

    /**Fields**/
    private String make;
    private String model;
    private double fuelLevel;
    private double mpg;
    private double range;

    /**Default constructor**/
    public car(){
        String make;
        String model;
        double fuelLevel = 0;
        double mpg = 0;
        double range = 0;
    }

    /**Secondary constructor**/
    public car(String carMake, String carModel, double howMuchFuel, double milesPG) {
        make = carMake;
        model = carModel;
        fuelLevel = howMuchFuel;
        mpg = milesPG;
        range = (fuelLevel * mpg);
    }

    /**Sets for all information into fields**/
    public void setMake(String carMake) {
        make = carMake;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public void setFuelLevel(double tankLevel) {
        fuelLevel = tankLevel;
    }

    public void setMpg(double milesPerGallon) {
        mpg = milesPerGallon;
    }

    /**Get for the car information**/
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public double getFuelLevel(){
        return fuelLevel;
    }

    public double getMpg(){
        return mpg;
    }

    public double getRange(){
        return range;
    }

    /**Method allowing user to input all the info for their own car**/
    public void inputCar(){
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the car make: ");
        setMake(data.nextLine());

        System.out.println("------------------------------");

        System.out.println("Enter the car model: ");
        setModel(data.nextLine());

        System.out.println("------------------------------");

        System.out.println("How much fuel is in the car in gallons: ");
        setFuelLevel(data.nextDouble());

        System.out.println("------------------------------");

        System.out.println("Enter the fuel efficiency (MPG): ");
        setMpg(data.nextDouble());

        range = fuelLevel * mpg;

        displayCarInformation();
    }

    /**displays all information on car**/
    public void displayCarInformation()
    {
        System.out.println("Displaying details for car");
        System.out.println("==============================");
        System.out.println("Car make: " + getMake());
        System.out.println("Car model: " + getModel());
        System.out.println("Fuel level (gallons):" + getFuelLevel());
        System.out.println("Fuel efficiency:" + getMpg());
        System.out.println("Your vehicle has a current range of: " + getRange() + " miles.");
    }
}

