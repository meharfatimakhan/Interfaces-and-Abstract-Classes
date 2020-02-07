/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyemployee;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ProjectManager extends SoftwareDeveloper {
    ArrayList<String> basicBenefits;
    ArrayList<String> developerBenefits;
    ArrayList<String> managerBenefits;
    final int payRate = 750;
    int hours;
    int pay;
    public ProjectManager(ArrayList<String> basicBenefits,ArrayList<String> developerBenefits, ArrayList<String> managerBenefits ,int hours)
    {
        super(basicBenefits, developerBenefits, hours);
        this.hours = hours;
        this.basicBenefits=basicBenefits;
        this.developerBenefits=developerBenefits;
        this.managerBenefits=managerBenefits;
    }
    
    @Override
    public void print(){
        System.out.println("Project Manager Benefits are listed below: ");
        System.out.println(basicBenefits);
        System.out.println(developerBenefits);
        System.out.println(managerBenefits);
         System.out.println("-----------------------------------------");
    }
    
    @Override
    public void calculatePay(){
        this.pay= this.payRate*this.hours;
        System.out.println("Project Manager's Pay: " + this.pay);
    }
}

