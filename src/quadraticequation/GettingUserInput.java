/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;

import java.util.Scanner;

/**
 *
 * @author epapa
 */
public class GettingUserInput {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        // Print out a number times 10
//        System.out.println("Enter a number");
//        
//        int number = inputScanner.nextInt();
//        System.out.println(number * 10);
        
        // Program to calculate the area of any rectangle
        
        // Input
//        System.out.println("Enter the lenght, breadth and height");
//        int l = inputScanner.nextInt();
//        int b = inputScanner.nextInt();
//        int h = inputScanner.nextInt();
//        
//        // Process
//        int volume = l * b * h;
//        
//        // Output
//        System.out.print("The Volume is: ");
//        System.out.println(volume);
        
        // Calculate the area of any circle
        // Assume PI
        final float PI = 3.142f;
        
        System.out.println("what is the radius");
        int radius= inputScanner.nextInt();
        double area = PI * Math.pow(radius , 2 );
        System.out.print("the area is :  ");
        System.out.println(area);
    }
}
