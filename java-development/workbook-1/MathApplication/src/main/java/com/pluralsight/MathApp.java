package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary=7865.01;
        double garySalary=4567.12;
        double highestSalary= Math.max(bobSalary,garySalary);
        System.out.println("the highest salary is " + highestSalary);

        double carPrice=2134.32;
        double truckPrice=8756.26;
        double lowestPrice = Math.min(carPrice,truckPrice);
        System.out.println("lowest cost of vehicles is"+lowestPrice);

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println( "the area of the circle is" + area);




    }
}
