/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaabstraction;
//package javaabstraction.CompanyEmployee;
import companyemployee.SoftwareDeveloper;
import companyemployee.Intern;
import companyemployee.ProjectManager;
import companyemployee.Employee;

import universitystudent.Student;
import universitystudent.StudentA;
import universitystudent.StudentB;
import universitystudent.StudentC;

import creatures.Creature;
import creatures.Dogs;
import creatures.Birds;
import creatures.Rabbits;
import creatures.Pets;
import creatures.BirdTricks;
import creatures.DogTricks;
import creatures.RabbitTrick;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Dell
 */
public class JavaAbstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("--------------Company Employees---------------------");
        
        ArrayList<String> internBenefits = new ArrayList<>();
        internBenefits.add("Free Food");
        internBenefits.add("10K Monthly Allowance");
        int hours=60;
        Employee empObj = new Intern(internBenefits, hours);
        empObj.print();
        
        ArrayList<String> devBenefits = new ArrayList<>();
        devBenefits.add("Transport");
        devBenefits.add("Annual Leaves");
        hours=100;
        empObj=new SoftwareDeveloper(internBenefits,devBenefits, hours);
        empObj.print();
        
        ArrayList<String> managerBenefits = new ArrayList<>();
        managerBenefits.add("2 Annual Leaves");
        managerBenefits.add("Car");
        managerBenefits.add("Furnished Apartment");
        hours=150;
        empObj=new ProjectManager(internBenefits,devBenefits,managerBenefits, hours);
        empObj.print();

        ArrayList<Intern> employeeList = new ArrayList<>();
        employeeList.add(new Intern(internBenefits,30));
        employeeList.add(new Intern(internBenefits,40));
        employeeList.add(new Intern(internBenefits,10));
        employeeList.add(new SoftwareDeveloper(internBenefits,devBenefits,50));
        employeeList.add(new ProjectManager(internBenefits,devBenefits,managerBenefits, 90));
        //Deciding on RunTime which function to call
        for (Employee employeeIterate : employeeList) {
            employeeIterate.calculatePay();
        }
       
        System.out.println("-----------------------------------------------");
        
        System.out.println("-------------University Students---------------");
        
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new StudentA());
        studentList.add(new StudentB());
        studentList.add(new StudentC());
        
        for (Student studentIterate : studentList) {
            System.out.println(studentIterate.calculateFee());
        }
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("-------------Creatures---------------");
        
        Dogs animal1 = new Dogs(true);
        animal1.breathe();
        animal1.eatFood();
        animal1.walk();
        animal1.playDead();
        System.out.println();
        
        Birds animal2 = new Birds(true);
        animal2.breathe();
        animal2.eatFood();
        animal2.walk();
        animal2.fly();
        animal2.makeNest();
        animal2.singSong();
        System.out.println();
        
        Rabbits animal3 = new Rabbits(true);
        animal3.breathe();
        animal3.eatFood();
        animal3.hop();
        animal3.doSomething();
        System.out.println();
    }
    
}
