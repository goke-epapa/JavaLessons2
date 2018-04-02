/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;

/**
 *
 * @author epapa
 */
public class Area {
    public static void main(String[] args) {
        // Calculate the area of a square given a side
        // A = l^2 where l = side
        int l = 10; // input
        int area; // output
        
        area = l * l; // process
        System.out.println(area);
        
        
        // TODO Calculate the area of a rectangle
        // A = l * b
        l= 10;
        int b = 5;
        area = l * b;
        
        System.out.println(area);
        
        // TODO Calculate the volume of a rectangle
        // V = l * b *  h
        l = 20;
        b = 10;
        int h = 30;
        int v = l * b * h ;
        System.out.println(v);
       
         int total = area + v;
         System.out.println(total);
         
    }
         
}
