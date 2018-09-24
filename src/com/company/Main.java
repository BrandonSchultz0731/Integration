package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {


  public static void main(String[] args) {
    Day today;
    int i = 0,j=0;
    i = i++;
    j = i++;
    System.out.println("i=" + i + " " + "j=" + j);

    String s1 = new String("abc"); //new operator
    String s2 = "abc"; //string literals

    Student brandon = new Student();

    brandon.setStudentID(815092842);
    brandon.setGpa(3.6);
    brandon.setName("Brandon");
    brandon.setSsn("SSN");
    System.out.println(brandon.toString());
    System.out.println(convertHexToDec("ABCDEF"));
    System.out.println("hello");
    if ((5.1 > 4.3 && 6.2 < 8.4) && !(7.2 < 3.5 || 1.2 == 2.1 || 2.2 != 2.25))
      System.out.print("TRUE");
    else
      System.out.print("FALSE");

    today = Day.MONDAY;

    switch (today){
      case MONDAY:
        System.out.println("I like mondays");
        break;
      case TUESDAY:
        System.out.println("I like tusdays");
        break;
      case WEDNESDAY:
        System.out.println("I like wednesdays");
        break;
      case THURSDAY:
        System.out.println("I like thursday");
        break;
      case FRIDAY:
        System.out.println("I like fridays");
        break;
      case SATURDAY:
        System.out.println("I like saturday");
        break;
      case SUNDAY:
        System.out.println("I like sunday");
        break;
    }

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
    int letterVal;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (Character.isDigit(s.charAt(track))) { //returns true if char is a digit
        int num = Character.getNumericValue(s.charAt(track));
        otherNum = (int) Math.pow(16, i);
        otherNum *= num;
      } else {
        //convert letter to num
        switch (s.charAt(track)){
          case 'A':
            letterVal = 10;
            otherNum = (int) Math.pow(16,i);
            otherNum *= letterVal;
            break;
          case 'B':
            letterVal = 11;
            otherNum = (int) Math.pow(16,i);
            otherNum *= letterVal;
            break;
          case 'C':
            letterVal = 12;
            otherNum = (int) Math.pow(16,i);
            otherNum *= letterVal;
            break;
          case 'D':
            letterVal = 13;
            otherNum = (int) Math.pow(16,i);
            otherNum *= letterVal;
            break;
          case 'E':
            letterVal = 14;
            otherNum = (int) Math.pow(16,i);
            otherNum *= letterVal;
            break;
          case 'F':
            letterVal = 15;
            otherNum = (int) Math.pow(16,i);
            otherNum *= letterVal;
            break;
            default:
              System.out.println("WHOOPS");
        }
      }
      count += otherNum;
      track++;
    }
    return count;
  }


}
