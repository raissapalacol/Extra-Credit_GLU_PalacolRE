/* EX02_GLU_PalacolRE */

package exercise2;

public class Singer {
    String name; 
    int noOfPerformances;
    double earnings;
    Song favoriteSong; 
    
    public Singer(String n, int p, double e){
        name = n;
        noOfPerformances = p;
        earnings = e;
    }
    
    public void performForAudience (int audi){
        noOfPerformances = noOfPerformances + 1;
        earnings = (audi * 100) + earnings; 
        System.out.println("Taylor swift has performed for " + audi + " people and now has " + earnings + " dollars.");
    }
    
    public void changeFavSong (Song nfs){
        favoriteSong = nfs;
        String favoriteSongTitle = favoriteSong.title;
        System.out.println("Taylor swifr has changed her favorite song to " + favoriteSongTitle);
    }
}
