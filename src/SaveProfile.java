
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


class SaveProfile {
    String name, type;
    private ArrayList<PGnormal> generatorList = new ArrayList();
    private final ArrayList<PGupgraded> upgradedList = new ArrayList();
    public SaveProfile(String n, String t){
        name = n;
        type = t;
    }
    public void addPGN(PGnormal pgn){
        generatorList.add(pgn);
    }
    public void addPGU(PGupgraded pgu){
        upgradedList.add(pgu);
    }
    public void save(PGnormal[] pgn, PGupgraded[] pgu, PrintWriter pw) throws IOException{
        System.out.println("Saving " + name + " using overwrite save");
        //takes in a list of all the point generators
        //uses forloops to travel through and print to text file
        pw.println(name);
        pw.println(type);
        for (int x=0;x<pgn.length;x++){
            pw.printf(pgn[x].toSaveString());
        }
        for (int x=0;x<pgu.length;x++){
            pw.printf(pgu[x].toSaveString());
        }
        System.out.println("Save Successful!");
    }
    public void save(PrintWriter pw) throws IOException{
        //this method is for saving when it is not the current save
        //in this scenario just save the values that it had prevoiusly
        //so it doesnt overwrite itself when it is not the save being used
        System.out.println("Saving " + name + " using regualar save");
        pw.println(name);
        pw.println(type);
        for (int x=0;x<generatorList.size();x++){
            pw.printf(generatorList.get(x).toSaveString());
            System.out.println(generatorList.get(x));
        }
        for (int x=0;x<upgradedList.size();x++){
            pw.printf(upgradedList.get(x).toSaveString());
            System.out.println(upgradedList.get(x));
        }
        System.out.println("Save Successful!");
    }
    //returns these variables for save state checking and arraylist cloning
    public String getName() {
        return name;
    }
    
    public ArrayList<PGnormal> getGeneratorList() {
        return generatorList;
    }

    public ArrayList<PGupgraded> getUpgradedList() {
        return upgradedList;
    }
}
