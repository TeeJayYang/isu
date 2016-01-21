public class PGnormal extends PointGenerator{
    //simply initiallizes the values of basecost, rate, name
    double basecost;
    public PGnormal(int c, int r, String n, int t){
        super(r,n,t);
        basecost = c;
    }
    public void upgrade() {
        System.out.print("WORK IN PROGRESS");
    }
    public final int getCost(){
        //base cost remains the same
        //but the actual cost increse per unit owned
        int finalcost = (int)(basecost * Math.pow(1.5, quantity));
        return finalcost;
    }
    //exclusive method
    public final int getBaseCost(){
        return (int)basecost;
    }
    
    //adds on the type, cost per unit, and actual cost of generator to the info
    public String toString(int upgradeCost){
        String str = super.toString();
        str += "Cost: " + getCost() + "\n";
        str += "Upgrade Cost: " + upgradeCost + "\n";
        str += "Price efficiency: " + calcRatetoPrice() + "points/$\n";
        str += "Type: Normal\n";
        return str;
    } 

    @Override
    public double calcRatetoPrice() {
        double cost = getCost();
        double ratio = rate/cost;
        ratio = (double)Math.round(ratio * 100d) / 100d;
        return ratio;
    }
}
