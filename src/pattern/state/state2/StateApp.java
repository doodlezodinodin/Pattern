package pattern.state.state2;

/**
 * Created by alex on 05.04.2017.
 */
public class StateApp {
}
class User{
    State state;
    public User(State state){
        this.state = state;
    }
    public void nextState(){

    }
    public void execute(){
        state.some();
    }
}
interface State{
    void some();
}
class One implements State{
    public void some(){

    }
}
class Two implements State{
    public void some(){

    }
}