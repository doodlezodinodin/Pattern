package pattern.composite.composite2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 03.04.2017.
 */
public class CompositeApp {
    public static void main(){

    }
}
interface Faction{
    void accept();
}
class FBI implements Faction{
    public void accept(){
        System.out.println("accept");
    }
}
class Gang implements Faction{
    public void accept(){
        System.out.println("accept");
    }
}
class Police implements Faction{
    public void accept(){
        System.out.println("accept");
    }
}
class Composite implements Faction{
    private List<Faction>  list = new ArrayList<>();

    public void addList(Faction faction){
        list.add(faction);
    }

    public void removeList(Faction faction){
        list.remove(faction);
    }
    public void accept(){
        for(Faction i : list){
            i.accept();
        }
    }

}

