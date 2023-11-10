/* EX03_GLU_PalacolRE */

package exercise3;

public class Song {
    private String title;  
    private String album; 
    private double duration;
    
    public Song(String t, String a, double d){
        title = t;
        album = a;
        duration = d; 
    }
    
    public void setTitle (String title){
        this.title = title; 
    }
    
    public void setAlbum (String album){
        this.album = album;
    }
    
    public void setDuration (Double duration){
        this.duration = duration; 
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
}
