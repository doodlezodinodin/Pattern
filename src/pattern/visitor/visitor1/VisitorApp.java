package pattern.visitor.visitor1;

/**
 * Created by alex on 03.04.2017.
 */
public class VisitorApp {
    public static void main(){

        Visitor user = new User();
        Element pc = new PC();
        pc.accept(user);
    }
}
interface Element{
    void accept(Visitor visitor);
}
class PC implements Element{
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
class Phone implements Element{
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
class Player implements Element{
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
interface Visitor{
    void visit(PC pc);
    void visit(Phone phone);
    void visit(Player player);
}
class User implements Visitor{

    public void visit(PC pc) {
        System.out.println("мучу шо хочу");
    }

    public void visit(Phone phone) {
        System.out.println("мучу шо хочу");
    }

    public void visit(Player player) {
        System.out.println("мучу шо хочу");
    }
}






