package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello");
    boolean result = true;
    char capC = 'C';
    byte b = 100;
    short i = 10000;
    int k = 93940594;
    long j = 999999999;
    double d = 345.345;
    float f = 123.4f;

    k = (int) d; //casting

    String s1 = new String("abc"); //new operator
    String s2 = "abc"; //string literals

    Student brandon = new Student();

    brandon.setStudentID(815092842);
    brandon.setGpa(3.6);
    brandon.setName("Brandon");
    brandon.setSsn("SSN");
    System.out.println(brandon.toString());
    System.out.println(convertHexToDec("341"));
    System.out.println("test");

//    Scanner scan = new Scanner(System.in);
////    //Convert gallons to liters
////    double numOfGal = scan.nextInt();
////    double numOfLit = numOfGal * 3.785;
////
////    System.out.println(numOfLit);

//		String[] strings = {"hi","hello"};
////		for(int test = 0; test < strings[1].length(); test++){
////			System.out.print(strings[test].length());
////		}

  }

  public static int convertHexToDec(String s) {
    int count = 0;
    int track = 0;
    int otherNum = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (Character.isDigit(s.charAt(track))) { //returns true if char is a digit
        int num = Character.getNumericValue(s.charAt(track));
        otherNum = (int) Math.pow(16, i);
        otherNum *= num;
      } else {
        //convert letter to num
      }
      count += otherNum;
    }
    return count;
  }


}
