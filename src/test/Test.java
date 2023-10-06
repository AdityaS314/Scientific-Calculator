/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Test {
    public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            
            System.out.println("Enter a binary number:");
 
            String n=s.nextLine();
            
            System.out.println(Integer.parseInt(n,16));
        }
}
