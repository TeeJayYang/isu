public abstract class PointGenerator{
    protected int quantity = 0, cost;
    protected double rate;
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
    public String toString(){
        return "Cost: " + cost;
    } 
    public abstract void powerUp();
}
