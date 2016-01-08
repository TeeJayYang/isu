public abstract class PointGenerator{
    protected int quantity = 0;
    protected double rate, basecost;
    protected String name;
    public final void setQuantity(int q){
        quantity = q;
    }
    public final double getRate(){
        return rate;
    }
    public final int getQuantity(){
        return quantity;
    }
    public final int getCost(){
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
