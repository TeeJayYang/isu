
import java.util.TimerTask;


public class Updater extends TimerTask {
    public Updater (){
        
    }
    public void run() {
        ISUgui.updateCall(AutoIncrease.calcTotalIncrease(1, 10, 100));
    }
    
}
