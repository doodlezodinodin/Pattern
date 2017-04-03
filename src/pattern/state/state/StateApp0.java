package pattern.state.state;

/**
 * Created by alex on 03.04.2017.
 */
public class StateApp0 {
    public static void main(){
        Gun gun = new Gun();
        gun.setWeaponC(new Shoutgun());
        gun.bang();
    }
}
interface Weapon{
    void bang();
}
class Deagle implements Weapon{
    public void bang(){
        System.out.println("deagle bang");
    }
}
class Shoutgun implements Weapon{
    public void bang(){
        System.out.println("shotgun bang");
    }
}
class M4 implements Weapon{
    public void bang(){
        System.out.println("m4 bang");
    }
}
class Gun{
    Weapon weapon;
    public void setWeaponC(Weapon weapon){
        this.weapon = weapon;
    }
    public void nextWeapon(){
        if(weapon instanceof Deagle){
            setWeaponC(new Shoutgun());
        }
        else if(weapon instanceof Shoutgun){
            setWeaponC(new M4());
        }
        else if(weapon instanceof M4) {
            setWeaponC(new Deagle());
        }
    }
    public void bang(){
        weapon.bang();
    }
}