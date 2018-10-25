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
public class Module {
   

    
String name;
String cID;
List<Student> students;


public Module(String name, String cID, List<Student> students ){
    this.name = name;
    this.cID = cID;
    this.students = students;

    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public void addStudents(Student student){
        students.add(student);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }



}
