
import java.util.TimerTask;


public class Updater extends TimerTask {
    public Updater (){
        
    }
    //this runs every second from the timer initiallized in the GUI
    //here you can manually change the rates of each of the point generators
    public void run() {
        ISUgui.updateCall(AutoIncrease.calcTotalIncrease(1, 10, 100));
    }
    
}
