
public class AutoIncrease {
    private static int totalIncrease = 0;
    private static int numG1=0, numG2=0, numG3=0;
    public AutoIncrease(){
        
    }
    public static int increase(int n){
        if (n==1){ 
            numG1++;
            return numG1;
        }
        else if (n==2){ 
            numG2++;
            return numG3;
        }
        else if (n==3){ 
            numG2++;
            return numG3;
        }
        else return 0;
    }
    public static int calcTotalIncrease(int r1, int r2, int r3){
        totalIncrease = numG1*r1 + numG2*r2 + numG3*r3;
        return totalIncrease;
    }
}
