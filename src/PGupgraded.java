public class PGupgraded extends PointGenerator{
    int durability;//exclusive variable
    //since the upgraded version is 100x better
    //code updates rate to be 100x more
    public PGupgraded(int r, String n){
        rate = r*100;
        name = n + " (Upgraded)";
    }
    public PGupgraded(int r, String n, int d){
        rate = r*100;
        name = n + " (Upgraded)";
        durability = d;
    }
    public void upgrade() {
        System.out.print("WORK IN PROGRESS");
    }
    public void decreaseDurability(){//exclusive method
        //game balance to ensure that upgraded generators dont last forever
        durability--;
    }
    public String toString(){
        String str = "=====" + name + "=====\n";
        str += "Generation rate per unit: " + rate + "/second\n";
        str += "Number of units: " + quantity + "\n";
        str += "Type: Upgraded\n";
        return str;
    } 
}
