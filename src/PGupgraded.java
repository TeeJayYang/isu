public class PGupgraded extends PointGenerator{

    public PGupgraded(int r, String n){
        rate = r*100;
        name = n + " (Upgraded)";
    }
    public void upgrade() {
        System.out.print("WORK IN PROGRESS");
    }
    public String toString(){
        String str = "=====" + name + "=====\n";
        str += "Generation rate per unit: " + rate + "/second\n";
        str += "Number of units: " + quantity + "\n";
        str += "Type: Upgraded\n";
        return str;
    } 
}
