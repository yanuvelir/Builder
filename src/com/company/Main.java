package com.company;

public class Main {

    public static void main(String[] args) {

        Cars car = new Cars("Honda", "Civic", "Blue", 28000 );
        Cars shortCar = new Cars("Mazda", "CX-5");

        System.out.println("The maker is: " + car.getMake());
        System.out.println("The mark is: " + car.getMark());
        System.out.println("The color is: " + car.getColor());
        System.out.println("The price is: " + car.getPrice());
        System.out.println("**********************");

        System.out.println("The maker is: " + shortCar.getMake());
        System.out.println("The mark is: " + shortCar.getMark());

    }
}
