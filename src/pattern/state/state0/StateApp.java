package pattern.state.state0;

/**
 * Created by alex on 03.04.2017.
 */
public class StateApp {
    public static void main(){
        Weapon weapon = new Weapon();
        weapon.setWeapon(new Shoutgun());
        weapon.bang();
        weapon.nextWeapon();
        weapon.bang();
    }
}
interface Gun{
    void bang();
}
class Deagle implements Gun{
    public void bang(){
        System.out.println("deagle bang");
    }
}
class Shoutgun implements Gun{
    public void bang(){
        System.out.println("shoutgun bang");
    }
}
class M4 implements Gun{
    public void bang(){
        System.out.println("m4 bang");
    }
}
class Weapon{
    Gun gun;
    public void setWeapon(Gun gun){
        this.gun = gun;
    }
    public void nextWeapon(){
        if(gun instanceof Deagle){
            setWeapon(new Shoutgun());
        }
        else if(gun instanceof Shoutgun){
            setWeapon(new M4());
        }
        else if(gun instanceof M4){
            setWeapon(new Deagle());
        }
    }
    public void bang(){
        gun.bang();
    }
}