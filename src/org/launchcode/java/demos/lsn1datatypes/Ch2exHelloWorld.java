package org.launchcode.java.demos.lsn1datatypes;

public class Ch2exHelloWorld {
   public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Hi,What's your name ? : ");
        String userName = input.nextLine();
        System.out.println("Hello "+ userName);


    }
}
