
import java.util.TimerTask;


public class Updater extends TimerTask {
    int rate[] = new int[3];
    public Updater (){
    }
    public void setRate(int num, int r){
        for (int x = 0; x < rate.length; x++){
            if (x==num){
                rate[x]=r;
            }
        }
    }
    //this runs every second from the timer initiallized in the GUI
    //here you can manually change the rates of each of the point generators
    public void run() {
        ISUgui.updateCall(AutoIncrease.calcTotalIncrease(rate[0], rate[1], rate[2]));
    }
    
}
