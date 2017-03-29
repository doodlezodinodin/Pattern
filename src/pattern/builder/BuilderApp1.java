package pattern.builder;

/**
 * Created by alex on 28.03.2017.
 */
public class BuilderApp1 {
    public static void main(){
        Computer comp = new BuilderComputer().buildName("one")
                                             .buildPower(true)
                                             .buildHdd(300)
                                             .buildMemory(2)
                                             .build();
        System.out.println(comp);
    }
}
class Computer{
    private String name;
    private boolean power;
    private int hdd;
    private int memory;

    public void setName(String name) {
        this.name = name;
    }
    public void setPower(boolean power) {
        this.power = power;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", hdd=" + hdd +
                ", memory=" + memory +
                '}';
    }
}
class BuilderComputer{
    private String name = "PC";
    private boolean power = true;
    private int hdd = 500;
    private int memory = 4;

    public BuilderComputer buildName(String name) {
        this.name = name;
        return this;
    }
    public BuilderComputer buildPower(boolean power) {
        this.power = power;
        return this;
    }
    public BuilderComputer buildHdd(int hdd) {
        this.hdd = hdd;
        return this;
    }
    public BuilderComputer buildMemory(int memory) {
        this.memory = memory;
        return this;
    }
    public Computer build(){
        Computer comp = new Computer();
        comp.setName(name);
        comp.setPower(power);
        comp.setHdd(hdd);
        comp.setMemory(memory);
        return comp;
    }
}
