package pattern.command;

/**
 * Created by alex on 30.03.2017.
 */
public class CommandApp0 {
    public static void main() {

    }
}
class Phone{
    public void call(){
        System.out.println("call..");
    }
    public void sendSms(){
        System.out.println("sendSms..");
    }
    public void playMusic(){
        System.out.println("Music play");
    }
}
interface CommandOne{

}
abstract class CommandPhone implements CommandOne{
    Phone phone = new Phone();
}
class Call extends CommandPhone{
    public void callPhone(){
        phone.call();
    }
}
class SendSms extends CommandPhone{
    public void sendSmsPhone(){
        phone.sendSms();
    }
}
class playMusic extends CommandPhone{
    public void playMusicPhone(){
        phone.playMusic();
    }
}
class UserOne{

}
