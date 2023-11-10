//EX05_GLU_PalacolRE

package exercise5;
import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name; 
    this.earnings = 0; 
    itemList = new ArrayList();
    storeList.add(this); 
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    int sizeArray = itemList.size();
    
   for (int i = 0; i < sizeArray; i++){
       if(i == index){
           String storeName = storeList.get(i).getName();
           earnings += itemList.get(i).getCost(); 
           System.out.println(storeName + " sold for " + itemList.get(i).getName() + " " + itemList.get(i).getCost());
       }
       else {
           String storeName = storeList.get(i).getName();
           System.out.println("There are only " + sizeArray + " items in " + storeName);
       }
       break; 
   }  
    System.out.println(""); 
   // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }

  public void sellItem(String name){  
    int sizeArray = itemList.size(); 
    
    for (int i = 0; i < sizeArray; i++){
       if(itemList.get(i).getName().equals(name)){
           String storeName = storeList.get(i).getName();
           earnings += itemList.get(i).getCost();
           System.out.println(storeName + " sold " + itemList.get(i).getName() + " for " + itemList.get(i).getCost());
       }
       else {
           String storeName = storeList.get(i).getName();
           System.out.println(storeName + " does not sell this item");
       } 
   }
     System.out.println(""); 
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){ 
    boolean found = false;
    int sizeArray = itemList.size();
    int itemIndex = 0;
    
    for (int index = 0; index < sizeArray; index++){
       if(itemList.contains(i)){
           found = true;
           itemIndex = index;             
       }
      
        if(!found){
            System.out.println("The store doesn't sell this item." );
        }
        else {
            earnings += itemList.get(itemIndex).getCost();
            System.out.println("The item " + itemList.get(itemIndex).getName() + " was sold for " + itemList.get(itemIndex).getCost());

        }
    
   }    
     System.out.println("");   
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
      itemList.add(i); 
    // add Item i to store's itemList
  }
  public void filterType(String type){
     int sizeArray = itemList.size();
     
     for (int i = 0; i < sizeArray; i++){
         if(itemList.get(i).getType().equalsIgnoreCase(type)){
            System.out.println(itemList.get(i).getName());
         }
     }  
     System.out.println(""); 
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
    int sizeArray = itemList.size();
    
     for (int i = 0; i < sizeArray; i++){
         if(itemList.get(i).getCost() <= maxCost){
            System.out.println(itemList.get(i).getName());
         }
     }
      System.out.println(""); 
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
     int sizeArray = itemList.size();
    
     for (int i = 0; i < sizeArray; i++){
         if(itemList.get(i).getCost() >= minCost){
            System.out.println(itemList.get(i).getName());
         }
     }
     System.out.println(""); 
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    int storeArray = storeList.size();
    
    for (int i = 0; i < storeArray; i++){
         String storeName = storeList.get(i).getName();
         double storeEarnings = storeList.get(i).getEarnings();
         System.out.println(storeName  + " earned " + storeEarnings + " dollars. ");
        }
        System.out.println(""); 
     }
    
}
