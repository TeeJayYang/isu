
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


class SaveProfile {
    String name, type;
    private final ArrayList<PGnormal> generatorList = new ArrayList();
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
        pw.println(name);
        pw.println(type);
        for (int x=0;x<pgn.length;x++){
            pw.printf(pgn[x].toSaveString());
        }
        for (int x=0;x<pgu.length;x++){
            pw.printf(pgu[x].toSaveString());
        }
        System.out.println("Save Successfull!");
        pw.println(Game.resources);
    }

    public String getName() {
        return name;
    }

    public ArrayList<PGnormal> getGeneratorList() {
        return generatorList;
    }

    public ArrayList<PGupgraded> getUpgradedList() {
        return upgradedList;
    }

    public String getType() {
        return type;
    }
    public String toStrig(){
        return "hi";
    }
}
