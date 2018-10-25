/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwareengineering.assignment1;
import java.util.ArrayList; 
import java.util.List;



/**
 *
 * @author 14493172
 */
public class Student {
String name;
int age;
String DOB;
int ID;
String username;
List<Module> modules;


public Student(String name, int age, String DOB, int ID, List<Module> modules){
    this.name = name;
    this.age = age;
    this.DOB = DOB;
    this.ID = ID;
    this.modules = modules;   

 
    }  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    } 

      public String getUsername() {
        String uName = getName() + Integer.toString(getAge());
        uName.replaceAll("\\s+","");

        return uName;
    }

   
}
