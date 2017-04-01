package pattern.composite.composite1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 01.04.2017.
 */
public class CompositeApp {
    public static void main(){
        Phone rp0 = new Iphone7();
        Phone rs0 = new Sumsung();
        Phone rf0 = new Fly();

        Phone ep0 = new Iphone7();
        Phone es0 = new Sumsung();
        Phone ef0 = new Fly();

        Composite comp = new Composite();
        Composite comp0 = new Composite();
        Composite comp1 = new Composite();

        comp0.addList(rp0);
        comp0.addList(rs0);
        comp0.addList(rf0);

        comp0.addList(ep0);
        comp0.addList(es0);
        comp0.addList(ef0);

        comp.addList(comp0);
        comp.addList(comp1);

        comp.call();

    }
}
interface Phone{
    void call();
}
class Iphone7 implements Phone{
    public void call(){
        System.out.println("Iphone call");
    }
}
class Sumsung implements Phone{
    public void call(){
        System.out.println("Sumsung call");
    }
}
class Fly implements Phone{
    public void call(){
        System.out.println("Fly call");
    }
}

class Composite implements Phone{
    List<Phone> list = new ArrayList<>();

    public void addList(Phone phone){
        list.add(phone);
    }
    public void removeList(Phone phone){
        list.remove(phone);
    }
    public void call(){
        for(Phone i : list){
            i.call();
        }
    }
}