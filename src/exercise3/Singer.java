/* EX03_GLU_PalacolRE */

package exercise3;

public class Singer {
    private String name; 
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances; 
    
    public Singer(String n, int p, double e){
        name = n;
        noOfPerformances = p;
        earnings = e;
        totalPerformances++; 
    }
    
    public void performForAudience (int audi){
        noOfPerformances = getNoOfPerformances() + 1;
        setEarnings((audi * 100) + getEarnings()); 
        System.out.println("Taylor swift has performed for " + audi + " people and now has " + getEarnings() + " dollars.");
    }
    
    public void performForAudience (int audi, Singer otherSinger){
         String SingerTwo = otherSinger.getName();
         double totalEarnings = audi*100;    
         double otherSingerEarnings = otherSinger.getEarnings(); 
         otherSinger.setEarnings(otherSingerEarnings + totalEarnings/2); 
         setEarnings(getEarnings()+ totalEarnings/2);  
         System.out.println(getName() + " and " + SingerTwo + " has performed together. They have earned " + totalEarnings + ". " + getName() + " now has " + getEarnings() + ". " + SingerTwo + " now has " + otherSinger.getEarnings() + " dollars.");
         
    }     
    public void changeFavSong (Song nfs){
        String favoriteSongTitle = nfs.getTitle(); 
        System.out.println("Taylor swift has changed her favorite song to " + favoriteSongTitle);
    } 
   
    public static int getTotalPerformances(){
        return totalPerformances; 
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the noOfPerformances
     */
    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    /**
     * @return the earnings
     */
    public double getEarnings() {
        return earnings;
    }

    /**
     * @param earnings the earnings to set
     */
    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

}
