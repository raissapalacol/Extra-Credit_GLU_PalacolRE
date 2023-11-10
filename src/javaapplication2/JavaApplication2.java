/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author raiss
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1 = "Amelia Smith"; 
        int age1 = 27; 
        double payment1 = 30.56d; 
        
        String name2 = "Charlotte Anderson"; 
        int age2 = 22; 
        double payment2 = 50.87d; 
        
        String name3 = "Luna Thomas"; 
        int age3 = 29; 
        double payment3 = 75.95d; 
        
        double totalPayment = payment1 + payment2 + payment3;
        boolean compareAge = age3>20 && age2>20 && age3>20; 
        int averageAge = (age1 + age2 + age3)/3; 
        
        
        System.out.println("Sales Record:");
        System.out.println();
        System.out.println("Customer: " + name1 + "\n" + "Age: " + age1 + "\n" + "Payment: $" + payment1); 
        System.out.println();
        System.out.println("Customer: " + name2 + "\n" + "Age: " + age2 + "\n" + "Payment: $" + payment2); 
        System.out.println();
        System.out.println("Customer: " + name3 + "\n" + "Age: " + age3 + "\n" + "Payment: $" + payment3); 
        System.out.println();
        System.out.println("The total payment of the three customers is: $" + totalPayment);
        System.out.println("All the customers are above the age of 20: " + compareAge);
        System.out.println("The average age of the customers is: " + averageAge);
        
       
        
        
        
        
                
        // TODO code application logic here
    }
    
}
