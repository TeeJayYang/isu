public class PGnormal extends PointGenerator{
    //simply initiallizes the values of basecost, rate, name
    public PGnormal(int c, int r, String n){
        basecost = c;
        rate = r;
        name = n;
    }
    public void upgrade() {
        System.out.print("WORK IN PROGRESS");
    }
    //adds on the type of generator to the info
    public String toString(){
        return super.toString() + "Type: Normal\n";
    } 
}
