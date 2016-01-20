public class PGupgraded extends PointGenerator{
    //exclusive variables
    int upgradeCost;
    //since the upgraded version is 100x better
    //code updates rate to be 100x more
    public PGupgraded(int r, String n){
        super(r, n);
        rate *=100;
        name += " (Upgraded)";
    }
    public void upgrade() {
        System.out.print("WORK IN PROGRESS");
    }
    public int getUpgradeCost(int baseCost) {
        int finalcost = baseCost * 100;
        finalcost *=  Math.pow(1.5, quantity);
        return finalcost;
    }
     public String toString(){
        String str = super.toString();
        str += "Type: Upgraded\n";
        return str;
    } 
}
