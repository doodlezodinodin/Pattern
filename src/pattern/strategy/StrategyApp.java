package pattern.strategy;

/**
 * Created by alex on 05.04.2017.
 */
public class StrategyApp {
    public static void main(){
        User user = new User(new One());
        user.execute();
    }
}
class User{
    Strategy strategy;
    public User(Strategy strategy){
        this.strategy = strategy;
    }
    public void execute(){
        strategy.someDo();
    }
}
interface Strategy{
    void someDo();
}
class One implements Strategy{
    public void someDo(){
        System.out.println("Что-то делаю брат, это тебе класс One говорит");
    }
}
class Two implements Strategy{
    public void someDo(){
        System.out.println("Что-то делаю брат, это тебе класс Two говорит");
    }
}
class Three implements Strategy{
    public void someDo(){
        System.out.println("Что-то делаю брат, это тебе класс Three говорит");
    }
}
