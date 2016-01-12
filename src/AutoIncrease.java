
public class AutoIncrease {
    private static int totalIncrease = 0;
    private static int numG1=0, numG2=0, numG3=0;
    private static int numGU1=0, numGU2=0, numGU3=0;
    public static int increase(String type, int n){
        if (type.equals("Normal")){
            if (n==1){ 
                numG1++;
                return numG1;
            }
            else if (n==2){ 
                numG2++;
                return numG2;
            }
            else if (n==3){ 
                numG3++;
                return numG3;
            }
            else return 0;
        }
        else if (type.equals("Upgraded")){
            if (n==1){ 
                numGU1++;
                return numGU1;
            }
            else if (n==2){ 
                numGU2++;
                return numGU2;
            }
            else if (n==3){ 
                numGU3++;
                return numGU3;
            }
            else return 0;
        }
        else return 0;
    }
    public static int calcTotalIncrease(int r1, int r2, int r3){
        int normalincreasetotal = numG1*r1 + numG2*r2 + numG3*r3;
        int upgradedincreasetotal = numGU1*r1*100 + numGU2*r2*100 + numGU3*r3*100;
        totalIncrease = normalincreasetotal + upgradedincreasetotal;
        return totalIncrease;
    }
}
