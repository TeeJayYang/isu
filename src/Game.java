
public class Game {
    private static int resources = 0;

    public static int getRes(){
        return resources;
    }
    public static void increaseResources(int inc){
        resources += inc;
    }
    public static void decreaseResources(int dec){
         resources -= dec;
    }
    public static String ToString(){
        return String.valueOf(resources);
    }
}
