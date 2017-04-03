package pattern.command.command0;

/**
 * Created by alex on 02.04.2017.
 */
public class CommandApp {
    public static void main(){
        Player play = new Player();
        User user = new User(new Play(play), new Stop(play), new Reset(play));

        user.playUser();
        user.stopUser();
        user.reserUser();
    }
}
class Player{
    public void play(){
        System.out.println("play music");
    }
    public void stop(){
        System.out.println("stop music");
    }
    public void reset(){
        System.out.println("reset music");
    }
}
interface Command{
    void execute();
}
abstract class CommandAbs implements Command{
    Player player;
}
class Play extends CommandAbs{
    public Play(Player player){
        this.player = player;
    }

    public void execute(){
        player.play();
    }
}
class Stop extends CommandAbs{
    public Stop(Player player){
        this.player = player;
    }

    public void execute(){
        player.stop();
    }
}
class Reset extends CommandAbs{
    public Reset(Player player){
        this.player = player;
    }

    public void execute(){
        player.reset();
    }
}
class User{
    Command play;
    Command stop;
    Command reset;

    public User(Command play, Command stop, Command reset){
        this.play = play;
        this.stop = stop;
        this.reset = reset;
    }

    public void playUser(){
        play.execute();
    }

    public void stopUser(){
        stop.execute();
    }

    public void reserUser(){
        reset.execute();
    }
}