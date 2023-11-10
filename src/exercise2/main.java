/* EX02_GLU_PalacolRE */

package exercise2; 
        
public class main {
    
    public static void main(String[] args){
        
        Customer c1 = new Customer("Amelia Smith", 30, 30.56); 
        Customer c2 = new Customer("Charlotte Anderson", 22, 50.87);
        Customer c3 = new Customer("Luna Thomas", 29, 75.95);
        
        Song song1 = new Song ("The Only Exception", "Brand New Eyes", 268);
        Song song2 = new Song ("Back to December", "Speak Now", 295);
        
        Singer singer1 = new Singer ("Taylor Swift", 5, 1000); 
        singer1.changeFavSong(song2); 
        singer1.performForAudience(12);
          
    }
}
