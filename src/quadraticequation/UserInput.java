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
public class UserInput {
    public static void main(String[] args) {
        Scanner look= new Scanner(System.in);
        int a= look.nextInt();
        int b= look.nextInt();
        int c= look.nextInt();
        int output = a + b + c ;
        System.out.println(output);
                
              
    }
}
