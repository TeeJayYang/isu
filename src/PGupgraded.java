public class PGupgraded extends PointGenerator{
    //exclusive variables
    int upgradeCost;
    //since the upgraded version is 100x better
    //code updates rate to be 100x more
    public PGupgraded(int r, String n, int t){
        super(r, n, t);
        rate *=100;
        name += " (Upgraded)";
    }
    //exclusive method
    public int getUpgradeCost(int bc) {
        calcUpgradeCost(bc);
        return upgradeCost;
    }
    
    private void calcUpgradeCost(int bc){
        upgradeCost = bc * 100;
        upgradeCost *=  Math.pow(1.5, quantity);
    }
    @Override
    public String toString(){
        String str = super.toString();
        str += "Price efficiency: " + calcRatetoPrice() + "points/$\n";
        str += "Type: Upgraded\n";
        return str;
    } 

    @Override
    public double calcRatetoPrice() {
        double cost = upgradeCost;
        double ratio = rate/cost;
        ratio = (double)Math.round(ratio * 100d) / 100d;
        return ratio;
    }
}
