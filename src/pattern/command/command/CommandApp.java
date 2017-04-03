package pattern.command.command;

/**
 * Created by alex on 02.04.2017.
 */
public class CommandApp {
    public static void main(){

        User user = new User(new Call(new Phone()), new SendSms(new Phone()), new PlayMusic(new Phone()));
        user.userCall();
        user.userSendSms();
        user.userPlayMusic();

    }
}
class Phone{
    public void call(){
        System.out.println("Phone call..");
    }
    public void sendSms(){
        System.out.println("Phone send sms");
    }
    public void playMusic(){
        System.out.println("Phone play music");
    }
}
interface Command{
    void execute();
}
abstract class CommandAbs implements Command{
    Phone phone;
}
class Call extends CommandAbs{
    public Call(Phone phone){
        this.phone = phone;
    }
    public void execute(){
        phone.call();
    }
}
class SendSms extends CommandAbs{
    public SendSms(Phone phone){
        this.phone = phone;
    }
    public void execute(){
        phone.sendSms();
    }
}
class PlayMusic extends CommandAbs{
    public PlayMusic(Phone phone){
        this.phone = phone;
    }
    public void execute(){
        phone.playMusic();;
    }
}
class User{
    Command call;
    Command sendSms;
    Command playMusic;
    public User(Command call, Command sendSms, Command playMusic){
        this.call = call;
        this.sendSms = sendSms;
        this.playMusic = playMusic;

    }
    public void userCall(){
        call.execute();
    }
    public void userSendSms(){
        sendSms.execute();
    }
    public void userPlayMusic(){
        playMusic.execute();
    }
}

