package pattern.factoryMethod;

/**
 * Created by alex on 28.03.2017.
 */
public class FactoryMethodApp {
    public static void main(){
        Factory factory = new FactoryElectronicWatch();
        Watch watch = factory.createWatch();
        watch.showTime();
    }
}

interface Watch{
    void showTime();
}
class ElectronicWatch implements Watch{
    public void showTime(){System.out.println("18:12:56");}
}
class RomeWatch implements Watch{
    public void showTime(){System.out.println("XI:V:II");}
}

interface Factory{
    Watch createWatch();
}
class FactoryElectronicWatch implements Factory{
    public Watch createWatch(){return new ElectronicWatch();}
}
class FactoryRomeWatch implements Factory{
    public Watch createWatch(){return new RomeWatch();}
}
