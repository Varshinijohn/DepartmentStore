package com.DepartmentalStore;

//UserInterface.java
import java.util.Scanner;

public class UserInterface {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     // Get customer details
     System.out.println("Enter the customer name");
     String customerName = sc.nextLine();
     System.out.println("Enter the phone number");
     String phoneNumber = sc.nextLine();
     System.out.println("Enter the street name");
     String streetName = sc.nextLine();
     System.out.println("Enter the bill amount");
     double billAmount = sc.nextDouble();
     System.out.println("Enter the distance");
     int distance = sc.nextInt();

     // Create CustomerDetails object
     CustomerDetails customer = new CustomerDetails(customerName, phoneNumber, streetName, billAmount, distance);

     // Display customer details
     System.out.println("Customer name: " + customer.getCustomerName());
     System.out.println("Phone number: " + customer.getPhoneNumber());
     System.out.println("Street name: " + customer.getStreetName());

     // Calculate and display bonus points
     double bonusPoints = customer.calculateBonusPoints();
     System.out.println("Bonus points: " + bonusPoints);

     // Calculate and display delivery charges
     double deliveryCharge = customer.deliveryCharge();
     System.out.println("Delivery charge: " + deliveryCharge);
 }
}
