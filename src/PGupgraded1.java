public class PGupgraded1 extends PointGenerator{

    public PGupgraded1(int c, int r, String n){
        basecost = c;
        rate = r;
        name = n;
    }
    public void upgrade() {
        System.out.print("WORK IN PROGRESS");
    }
    public String toString(){
        return super.toString() + "Type: Upgraded\n";
    } 
}
