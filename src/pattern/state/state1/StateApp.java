package pattern.state.state1;

/**
 * Created by alex on 03.04.2017.
 */
public class StateApp {
    public static void main(){
        State s = new State(new Shotgun());
        s.bang();
    }
}
interface Gun{
    void bang();
}
class Deagle implements Gun{
    public void bang(){
        System.out.println("bang deagle");
    }
}
class Shotgun implements Gun{
    public void bang(){
        System.out.println("bang shoutgun");
    }
}
class m4 implements Gun{
    public void bang(){
        System.out.println("bang m4");
    }
}
class State{
    Gun gun;

    public State(Gun gun){
        this.gun = gun;
    }

    public void bang(){
        gun.bang();
    }
}