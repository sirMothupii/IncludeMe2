/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sirmothupii.includeme;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sponch
 */
public class SpendingHelper {
    
    Spending spending[];

    public SpendingHelper(Spending[] spending) {
        this.spending = spending;
    }
        
    public SpendingHelper(){
    
    }
    
    /*
    this method will read and laod data from file 
    */
    public void loadSpendingFromFile() throws IOException{
        
    //include file name here!!!
    String department;
    int progNumber;
    String program;
    int finYear;
    String budgetPhase;
    String economicClass;
    String governement;
    float value;
    
    int commaPos;
    int counter = 0;
    
        
    //TODO: implement read to file
    BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    try {
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

    while (line != null) {
        
        counter++;
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
        
        commaPos = line.indexOf(",");
        
        department = line.substring(1, commaPos -1);
        line = line.substring(commaPos);
        commaPos = line.indexOf(",");
        
        
        progNumber = Integer.parseInt(line.substring(1, commaPos - 1));
        line = line.substring(commaPos);
        commaPos = line.indexOf(",");
        
        program = line.substring(1, commaPos);
        line = line.substring(commaPos);
        commaPos = line.indexOf(commaPos);
        
        finYear = Integer.parseInt(line.substring(1, commaPos - 1));
        line = line.substring(commaPos);
        commaPos = line.indexOf(commaPos);
        
        budgetPhase = line.substring(1, commaPos - 1);
        line = line.substring(commaPos);
        commaPos = line.indexOf(commaPos);
        
        economicClass = line.substring(1, commaPos - 1);
        line = line.substring(commaPos);
        commaPos = line.indexOf(commaPos);
        
         budgetPhase = line.substring(1, commaPos - 1);
        line = line.substring(commaPos);
        commaPos = line.indexOf(commaPos);
        
        line = line.substring(commaPos);
        commaPos = line.indexOf(commaPos);
        
         line = line.substring(commaPos);
        commaPos = line.indexOf(commaPos);
        
        line = line.substring(commaPos);
        commaPos = line.indexOf(commaPos);
        
        
        line = line.substring(commaPos);
        commaPos = line.indexOf(commaPos);
        
        value = Float.parseFloat(line.substring(1, commaPos));
        line = line.substring(commaPos);
        commaPos = line.indexOf(commaPos);
        
        governement = line.substring(1, commaPos);
        
        
        
        spending[counter] = new Spending(department, progNumber, program, finYear, budgetPhase, economicClass, governement, value);
        
        
        
        
        
        
         
    }
    String everything = sb.toString();
}       catch (IOException ex) {
            Logger.getLogger(SpendingHelper.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
    br.close();
}
    
        
        
        
    }

    public Spending[] getSpending() {
        return spending;
    }
 


};
    
    
    
    
    
 
   
