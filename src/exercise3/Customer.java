/* EX03_GLU_PalacolRE */

package exercise3;

public class Customer {
    private String name;
    private int age;
    private double payment;
    
    public Customer(String n, int a, double p){
        name = n;
        age = a;
        payment = p; 
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge (){
        return age; 
    }
    
    public double getPayment (){
        return payment; 
    }
}