package pattern.visitor;

/**
 * Created by alex on 01.04.2017.
 */
public class VisitorApp1 {
    public static void main(){
        Builder builder = new Builder();

        builder.visit(new House());
    }
}
interface VisitorOne{
    void visit(House house);
}
interface ElementOne{
    void accept(VisitorOne visitor);
}
class Builder implements VisitorOne{
    public void visit(House house){
        house.setCountRooms(45);
        house.setCountResidents(102);
        System.out.println("123");
    }
}
class House implements ElementOne{
    private int countRooms;
    private int countResidents;

    public void setCountRooms(int countRooms) {
        this.countRooms = countRooms;
    }

    public void setCountResidents(int countResidents) {
        this.countResidents = countResidents;
    }

    public void accept(VisitorOne visitor){
        visitor.visit(this);
    }
}