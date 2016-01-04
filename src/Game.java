
public class Game {
    private int resources;
    
    public Game(){
        resources = 0;
    }
    public int getRes(){
        return resources;
    }
    public void increaseResources(int inc){
        resources += inc;
    }
    public void decreaseResources(int dec){
         resources -= dec;
    }
    public String ToString(){
        return String.valueOf(resources);
    }
}
