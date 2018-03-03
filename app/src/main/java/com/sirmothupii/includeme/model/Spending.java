/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sirmothupii.includeme.model;

/**
 *
 * @author sponch
 */
public class Spending {
    
    private String department;
    private int programNumber;
    private String program;
    private int finYear;
    private String budgetPhase;
    private String economicClass;
    private String governement;
    private float value;

    public Spending(String department, int programNumber, String program, int finYear, String budgetPhase, String economicClass, String governement, float value) {
        this.department = department;
        this.programNumber = programNumber;
        this.program = program;
        this.finYear = finYear;
        this.budgetPhase = budgetPhase;
        this.economicClass = economicClass;
        this.governement = governement;
        this.value = value;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getProgramNumber() {
        return programNumber;
    }

    public void setProgramNumber(int programNumber) {
        this.programNumber = programNumber;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getFinYear() {
        return finYear;
    }

    public void setFinYear(int finYear) {
        this.finYear = finYear;
    }

    public String getBudgetPhase() {
        return budgetPhase;
    }

    public void setBudgetPhase(String budgetPhase) {
        this.budgetPhase = budgetPhase;
    }

    public String getEconomicClass() {
        return economicClass;
    }

    public void setEconomicClass(String economicClass) {
        this.economicClass = economicClass;
    }

    public String getGovernement() {
        return governement;
    }

    public void setGovernement(String governement) {
        this.governement = governement;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    
    
    
}
