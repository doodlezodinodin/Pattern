package pattern.templateMethod.templateMethod0;

/**
 * Created by alex on 01.04.2017.
 */
public class TemplateMethodApp {
    public static void main(){
        A a = new A();
        B b = new B();

        a.write();
        System.out.println();
        b.write();
    }
}
abstract class Template{
    public void write(){
        System.out.println("1");
        method0();
        System.out.println("5");
        method1();
    }

    abstract void method0();
    abstract void method1();
}
class A extends Template{
    public void method0(){
        System.out.println("2");
    }
    public void method1(){
        System.out.println("6");
    }
}
class B extends Template{
    public void method0(){
        System.out.println("3");
    }
    public void method1(){}
}
