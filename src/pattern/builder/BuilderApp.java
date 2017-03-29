package pattern.builder;

/**
 * Created by alex on 28.03.2017.
 */
public class BuilderApp {
    public static void main(){
        Car car = new CarBuilder()
                    .buildName("d")
                    .buildTransmission(Transmission.AUTO)
                    .buildMaxSpeed(200)
                    .build();
        System.out.println(car);
    }
}
enum Transmission{
    MANUAL, AUTO
}
class Car{
    private String name;
    private Transmission transmission;
    private int maxSpeed;

    public void setName(String name){this.name = name;}
    public void setTransmission(Transmission transmission){this.transmission = transmission;}
    public void setMaxSpeed(int maxSpeed){this.maxSpeed = maxSpeed;}

    public String toString(){return "auto: name["+name+"] transmission["+transmission+"] maxSpeed["+maxSpeed+"]";}
}

class CarBuilder{
    private String name = "BMV";
    private Transmission transmission = Transmission.AUTO;
    private int maxSpeed = 150;

    public CarBuilder buildName(String name){
        this.name = name;
        return this;
    }
    public CarBuilder buildTransmission(Transmission transmission){
        this.transmission = transmission;
        return this;
    }
    public CarBuilder buildMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
        return this;
    }
    public Car build(){
        Car car = new Car();
        car.setName(name);
        car.setTransmission(transmission);
        car.setMaxSpeed(maxSpeed);
        return car;
    }
}
















