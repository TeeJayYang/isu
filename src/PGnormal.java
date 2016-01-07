
public class PGnormal extends PointGenerator{
    public PGnormal(int c, int r, String n){
        cost = c;
        rate = r;
        name = n;
    }
    public void powerUp() {
        System.out.print("WORK IN PROGRESS");
    }
    public String toString(){
        return super.toString() + "Type: Normal\n";
    } 
}
