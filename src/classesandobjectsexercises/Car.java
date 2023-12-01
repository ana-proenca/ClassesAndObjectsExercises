/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjectsexercises;

/**
 *
 * @author anaclaudiaproenca
 */
public class Car {
    String make;
    String model;
    int numWheels;
    String colour;
    
    public void drive(String diretion) {
        System.out.println("The " + colour + " " + make + " is driving " +  diretion);
    }
}
