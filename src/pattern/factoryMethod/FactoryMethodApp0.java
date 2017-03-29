package pattern.factoryMethod;

/**
 * Created by alex on 28.03.2017.
 */
public class FactoryMethodApp0 {
    public static void main(){
        FactoryPhone factory = new FactoryIphone();
        Phone phone = factory.getPhone();

        phone.sendSms();
    }
}
interface Phone{
    void call();
    void showTime();
    void sendSms();
}
class Iphone implements Phone{
    public void call(){System.out.println("Call number");}
    public void showTime(){System.out.println("14:32:34");}
    public void sendSms(){System.out.println("Send message");}
}
class Samsung implements Phone{
    public void call(){System.out.println("Наберая номер");}
    public void showTime(){System.out.println("22:02:44");}
    public void sendSms(){System.out.println("Отправляю смс");}
}
interface FactoryPhone{
    Phone getPhone();
}
class FactoryIphone implements FactoryPhone{
    public Phone getPhone(){return new Iphone();}
}
class FactorySamsung implements FactoryPhone{
    public Phone getPhone(){return new Samsung();}
}