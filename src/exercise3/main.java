/* EX03_GLU_PalacolRE */

package exercise3; 
        
public class main {
    
    public static void main(String[] args){
        
        Customer c1 = new Customer("Amelia Smith", 27, 30.56);
        Customer c2 = new Customer("Charlotte Anderson", 22, 50.87);
        Customer c3 = new Customer("Luna Thomas", 29, 75.95);
        
        System.out.println(c1.getName());
        System.out.println(c2.getAge());
        System.out.println(c3.getPayment());
        
        Song song1 = new Song ("The Only Exception", "Brand New Eyes", 268);
        Song song2 = new Song ("Back to December", "Speak Now", 295);
    
        song1.setTitle("bad");
        song1.setAlbum("0.1 flaws and all.");
        song1.setDuration(262.0); 
        
        Singer singer1 = new Singer ("Taylor Swift", 5, 0); 
        Singer singer2 = new Singer ("Wave to Earth", 12, 0); 
        System.out.println(Singer.getTotalPerformances());
        singer1.changeFavSong(song2); 
        singer1.performForAudience(12,singer2);
          
    }
}
