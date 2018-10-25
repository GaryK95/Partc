/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwareengineering.assignment1;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/**
 *
 * @author 14493172
 */

public class Course {
   
String name;

LocalDate startDate = new LocalDate();
LocalDate endDate = new LocalDate();

List<Module> modules;


public Course(String name, LocalDate startDate, LocalDate endDate,List<Module> modules){
    this.name = name;
    this.startDate = startDate;
    this.endDate = endDate;
    this.modules = modules;
    
}

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
    
    public void addModule(Module module){
        modules.add(module);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
 }
