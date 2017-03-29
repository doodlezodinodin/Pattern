package pattern.command;

/**
 * Created by alex on 29.03.2017.
 */
public class CommandApp {
    public static void main(){

        Computer comp = new Computer();
        User user = new User(new Start(comp), new Stop(comp), new Reset(comp));

        user.startComputer();
        user.stopComputer();
        user.resetComputer();
    }
}
interface Command{
    void execute();
}
//Receiver/Прийомник
class Computer{
    public void start(){System.out.println("Start computer");}
    public void stop(){System.out.println("Stop computer");}
    public void reset(){System.out.println("Reset computer");}
}
//ConcreteCommand
class Start implements Command{
    Computer computer;
    public Start(Computer computer){this.computer = computer;}
    public void execute(){computer.start();};
}
class Stop implements Command{
    Computer computer;
    public Stop(Computer computer){this.computer = computer;}
    public void execute(){computer.stop();};
}
class Reset implements Command{
    Computer computer;
    public Reset(Computer computer){this.computer = computer;}
    public void execute(){computer.reset();};
}
//Invoker
class User{
    Command start;
    Command stop;
    Command reset;
    public User(Command start, Command stop, Command reset){
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }
    public void startComputer(){start.execute();}
    public void stopComputer(){stop.execute();}
    public void resetComputer(){reset.execute();}
}