public abstract class PointGenerator{
    private static int quantity, cost;
    private static double rate;
    public static void setQuantity(int q){
        quantity = q;
    }
    public static double getRate(){
        return rate;
    }
    public static int getQuantity(){
        return quantity;
    }
    public static int getCost(){
        return cost;
    }
    public abstract void powerUp();
    public static void upQuantity(){
        quantity++;
    }
    public static void upCost(){
        cost *= 2;
    } 
}
