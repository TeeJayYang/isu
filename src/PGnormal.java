
public class PGnormal extends PointGenerator{
    public PGnormal(int c, int r){
        cost = c;
        rate = r;
    }
    public void powerUp() {
        System.out.print("This is the first PG");
    }
    public String toString(){
        return super.toString() + " (Normal Type)";
    } 
}
