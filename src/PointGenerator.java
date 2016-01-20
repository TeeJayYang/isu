public abstract class PointGenerator{
    //parent of the point generators
    //has rates, quantity, basecosts
    //mostly getters and setters
    protected int quantity = 0, rate, totalPointGenerated = 0;
    protected double priceToRateRatio;
    protected String name;
    public PointGenerator(int r, String n){
        rate = r;
        name = n;
    }
    public final void setQuantity(int q){
        quantity = q;
    }
    public final int getRate(){
        return rate;
    }
    public final int getQuantity(){
        return quantity;
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
        str += "Generation rate per unit: " + rate + "/second\n";
        str += "Number of units: " + quantity + "\n";
        return str;
    } 
    public abstract void upgrade();
}
