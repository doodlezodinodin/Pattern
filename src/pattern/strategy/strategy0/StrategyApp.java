package pattern.strategy.strategy0;

/**
 * Created by alex on 05.04.2017.
 */
public class StrategyApp {
    public static void main(){

    }
}
class User{
    private Strategy strategy;

    public User(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(){

    }
}
interface Strategy{
    void some();
}
class One implements Strategy{
    public void some(){}
}
class Two implements Strategy{
    public void some(){}
}
