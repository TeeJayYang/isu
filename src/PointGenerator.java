public abstract class PointGenerator{
    protected int quantity = 0, cost;
    protected double rate;
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
        return cost;
    }
    
    public final void upQuantity(){
        quantity++;
    }
    public final void upCost(){
        cost *= 1.2;
    }
    public final String getName(){
        return name;
    }
    public String toString(){
        String str = "=====" + name + "=====\n";
        str += "Cost: " + cost + "\n";
        str += "Generation rate per unit: " + rate + "/second\n";
        str += "Number of units: " + quantity + "\n";
        return str;
    } 
    public abstract void powerUp();
}
