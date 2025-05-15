/*
Q. Write a program that defines a Car class with attributes brand, model, and year.

    - Create an object of the class and print its details.
    
 */

public class Create_a_Simple_Class_n_Object {

    public static void main(String[] args){
        Car car = new Car();
        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.year);
    }
}

class Car {
    String brand = "Tata";
    String model = "Nano";
    int year = 2000;
}