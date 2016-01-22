
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;


class SaveProfile {
    String name, type;
    HashSet<PGnormal> norms = new HashSet<>();
    HashSet<PGupgraded> ups = new HashSet<>();
    public SaveProfile(String n, String t){
        name = n;
        type = t;
    }
    public void save(PGnormal[] pgn, PGupgraded[] pgu,PrintWriter pw){
        pw.println(Game.resources);
        System.out.println(Game.resources);
        for (int x=0;x<pgn.length;x++){
            norms.add(pgn[x]);
        }
        Iterator it = norms.iterator();
        while (it.hasNext()){
            PGnormal pg = (PGnormal)it.next();
            System.out.print(pg.toSaveString());
            pw.println(pg.toSaveString());
            
        }
        for (int x=0;x<pgu.length;x++){
            ups.add(pgu[x]);
        }
        it = ups.iterator();
        while (it.hasNext()){
            PGupgraded pg = (PGupgraded)it.next();
            pw.println(pg.toSaveString());
        }
        
    }
}
