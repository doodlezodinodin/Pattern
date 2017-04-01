package pattern.visitor.Visitor0;

/**
 * Created by alex on 31.03.2017.
 */
public class VisitorApp0 {
    public static void main(){
        CarElement car = new CarElement();

        car.accept(new Driver());
        System.out.println("********************");
        car.accept(new Mechanic());
    }
}
interface Visitor{
    void visit(WheelElement wheelElement);
    void visit(BodyElement bodyElement);
    void visit(EngineElement engineElement);
    void visit(CarElement carElement);
}
class Driver implements Visitor{
    public void visit(WheelElement wheelElement) {
        System.out.println("Водитель: пробил " + wheelElement.getWheel() + ". ");
    }

    public void visit(BodyElement bodyElement) {
        System.out.println("Водитель: выпачкал кузов. ");
    }

    public void visit(EngineElement engineElement) {
        System.out.println("Водитель: сломал двигатель. ");
    }

    public void visit(CarElement carElement) {
        System.out.println("Водитель: повредил машину. ");
    }
}
class Mechanic implements Visitor{
    public void visit(WheelElement wheelElement) {
        System.out.println("Механик: заклеил " + wheelElement.getWheel() + ". ");
    }

    public void visit(BodyElement bodyElement) {
        System.out.println("Механик: почистил кузов. ");
    }

    public void visit(EngineElement engineElement) {
        System.out.println("Механик: починил двигатель. ");
    }

    public void visit(CarElement carElement) {
        System.out.println("Механик: закончил. ");
    }
}
//***
interface Element{
    void accept(Visitor visitor);
}
class WheelElement implements Element{
    private String name;

    public WheelElement(String name){
        this.name = name;
    }

    public String getWheel(){
        return name;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
class BodyElement implements Element{
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
class EngineElement implements Element{
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
class CarElement implements Element{
    Element[] elements;

    public CarElement(){
        elements = new Element[]{new WheelElement("переднее ПРАВОЕ колесо"), new WheelElement("переднее ЛЕВОЕ колесо"),
        new WheelElement("заднее ПРАВОЕ колесо"), new WheelElement("заднее ЛЕВОЕ колесо"),
        new BodyElement(), new EngineElement()};
    }

    public void accept(Visitor visitor){
        for(Element i : elements){
            i.accept(visitor);
        }
        visitor.visit(this);
    }
}

