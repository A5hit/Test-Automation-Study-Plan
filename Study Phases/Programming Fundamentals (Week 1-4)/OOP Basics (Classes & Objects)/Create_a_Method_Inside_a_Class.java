/*
Q. Modify the Car class to include a method displayDetails() that prints the car's details when called.

*/


public class Create_a_Method_Inside_a_Class {

    public static void main(String[] args) {
        CAR1 car = new CAR1();
        car.Brand="Toyota";
        car.Model="Skyliner";
        car.Year=2016;
        car.displayDetails();

    }
}

class CAR1 {
    String Brand;
    String Model;
    int Year;

    public void displayDetails() {
        System.out.println(Brand);
        System.out.println(Model);
        System.out.println(Year);
    }
}
