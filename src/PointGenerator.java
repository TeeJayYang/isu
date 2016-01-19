public abstract class PointGenerator{
    //parent of the point generators
    //has rates, quantity, basecosts
    //mostly getters and setters
    protected int quantity = 0, rate;
    protected double basecost;
    protected String name;
    public final void setQuantity(int q){
        quantity = q;
    }
    public final int getRate(){
        return rate;
    }
    public final int getQuantity(){
        return quantity;
    }
    public final int getCost(){
        //base cost remains the same
        //but the actual cost increse per unit owned
        int finalcost = (int)(basecost * Math.pow(1.5, quantity));
        return finalcost;
    }
    public final int getBaseCost(){
        return (int)basecost;
    }
    
    public final void upQuantity(){
        quantity++;
    }
    public final void downQuantity(){
        quantity--;
    }
    public final String getName(){
        return name;
    }
    public String toString(){
        String str = "=====" + name + "=====\n";
        str += "Cost: " + getCost() + "\n";
        str += "Upgrade Cost: " + basecost * 100 + "\n";
        str += "Generation rate per unit: " + rate + "/second\n";
        str += "Number of units: " + quantity + "\n";
        return str;
    } 
    public abstract void upgrade();
}
