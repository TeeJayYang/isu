public class PGupgraded1 extends PointGenerator{

    public PGupgraded1(int r, String n){
        rate = r*100;
        name = n + " (Upgraded)";
    }
    public void upgrade() {
        System.out.print("WORK IN PROGRESS");
    }
    public String toString(){
        return super.toString() + "Type: Upgraded\n";
    } 
}
