package pattern.state;

/**
 * Created by alex on 29.03.2017.
 */
public class StateApp0 {
    public static void main() {
        Human human = new Human();
        human.setState(new Work());

        for(int i=0; i<15; i++){
            human.doSomething();
        }
    }
}
//Context
class Human{
    private Activity state;
    public void setState(Activity state){this.state = state;}
    public void doSomething(){
        state.doSomething(this);
    }
}
//State
interface Activity{
    void doSomething(Human context);
}
class Work implements Activity{
    public void doSomething(Human context){
        System.out.println("Работаем..");
        context.setState(new Weekend());
    }
}
class Weekend implements Activity{
    private int count = 0;
    public void doSomething(Human context){
        if(count < 3){
            System.out.println("Отдыхаем..(Zzzz)");
            count++;
        }
        else{
            context.setState(new Work());
        }
    }
}
