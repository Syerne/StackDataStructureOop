package com.blz.datastructure.utils;

import java.util.Scanner;

public class Inputs {
   public static final Scanner sc = new Scanner(System.in);
   public static int getIntValue(){
       System.out.println("inside get in method");
       return sc.nextInt();
   }
}
