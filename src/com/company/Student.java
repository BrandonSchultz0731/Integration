package com.company;

public class Student {

  private int studentID; //variable declarations
  private String name;
  private String ssn;
  private double gpa;
  public final int SCHCODE = 34958; //constant declaration

  public Student() {
    //constructor
  }

  public int getStudentID() {
    //An accessor method
    return studentID;
  }

  public void setStudentID(int x) {
    //A mutator method
    studentID = x;
  }

  public String getName() {
    return name;
  }

  public void setName(String n) {
    name = n;
  }

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String s) {
    ssn = s;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double g) {
    gpa = g;
  }

  public String toString() {
    String s1 = "";
    s1 = "Student ID: " + getStudentID() +
        "\nStudent Name: " + getName() +
        "\nStudent SSN: " + getSsn() +
        "\nStudent GPA: " + getGpa();

    return s1;
  }


}
