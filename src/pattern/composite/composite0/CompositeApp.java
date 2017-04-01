package pattern.composite.composite0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 01.04.2017.
 */
public class CompositeApp {
    public static void main(){
        GroovSt g0 = new GroovSt();
        GroovSt g1 = new GroovSt();
        GroovSt g2 = new GroovSt();

        Ballas b0 = new Ballas();
        Ballas b1 = new Ballas();
        Ballas b2 = new Ballas();

        Rifa r0 = new Rifa();
        Rifa r1 = new Rifa();
        Rifa r2 = new Rifa();

        Vagos v0 = new Vagos();
        Vagos v1 = new Vagos();
        Vagos v2 = new Vagos();

        Composite gang = new Composite();

        Composite groov = new Composite();
        Composite ballas = new Composite();
        Composite rifa = new Composite();
        Composite vagos = new Composite();

        groov.addList(g0);
        groov.addList(g1);
        groov.addList(g2);

        ballas.addList(b0);
        ballas.addList(b1);
        ballas.addList(b2);

        rifa.addList(r0);
        rifa.addList(r1);
        rifa.addList(r2);

        vagos.addList(v0);
        vagos.addList(v1);
        vagos.addList(v2);

        gang.addList(groov);
        gang.addList(ballas);
        gang.addList(rifa);
        gang.addList(vagos);

        gang.bang();

    }
}
interface Gang{
    void bang();
}
class GroovSt implements Gang{
    public void bang(){
        System.out.println("[GroovSt]: bang bang bang");
    }
}
class Ballas implements Gang{
    public void bang(){
        System.out.println("[Ballas]: bang bang bang");
    }
}
class Rifa implements Gang{
    public void bang(){
        System.out.println("[Rifa]: bang bang bang");
    }
}
class Vagos implements Gang{
    public void bang(){
        System.out.println("[VagosSt]: bang bang bang");
    }
}
class Composite implements Gang{
    private List<Gang> list = new ArrayList<>();

    public void addList(Gang gang){
        list.add(gang);
    }

    public void removeList(Gang gang){
        list.remove(gang);
    }

    public void bang(){
        for(Gang i : list){
            i.bang();
        }
    }
}

