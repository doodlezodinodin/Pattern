package pattern.visitor;

/**
 * Created by alex on 29.03.2017.
 */
public class VisitorApp {
    public static void main(){
        Phone phone = new Phone();
        User user = new User();

        phone.accept(user);
    }
}
// Конкретные элементы
interface Element{
    void accept(Visitor visitor);
}
class Phone implements Element{
    private int number;
    private String Color;
    private int memory;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
class PC implements Element{
    private String name;
    private int hdd;
    private boolean drive;

    public void setName(String name) {
        this.name = name;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setDrive(boolean drive) {
        this.drive = drive;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
// Посетители
interface Visitor{
    void visit(Phone phone);
    void visit(PC pc);
}
class User implements Visitor{
    public void visit(Phone phone){
        System.out.println("Пользователь изменил номер телефона");
        phone.setNumber(25825);
        System.out.println("Пользователь изменил цвет телефона");
        phone.setColor("Серый");
    }
    public void visit(PC pc){}
}
class Master implements Visitor{
    public void visit(Phone phone){}
    public void visit(PC pc){}
}