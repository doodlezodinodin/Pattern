package pattern.builder;

/**
 * Created by alex on 28.03.2017.
 */
public class BuilderApp0 {
    public static void main(){
        Admin admin = new Admin();
        admin.setBuilder(new Bob());
            Player player00 = admin.buildPlayer();

        System.out.println(player00);
    }
}
enum Faction{
    POLICE, FBI,
    GANG, MAFIA,
    NEWS, MEDIC
}
class Player{
    private String nick;
    private int level;
    private float money;
    private Faction faction;

    public void setNick(String nick){this.nick = nick;}
    public void setLevel(int level){this.level = level;}
    public void setMoney(int money){this.money = money;}
    public void setFaction(Faction faction){this.faction = faction;}

    public String toString(){return "player: nick["+nick+"] level["+level+"] money["+money+"] faction["+faction+"]";}
}
abstract class Builder{
    Player player;
    public void createPlayer(){player = new Player();}

    public abstract void buildNick();
    public abstract void buildLevel();
    public abstract void buildMoney();
    public abstract void buildFaction();

    public Player getPlayer(){return player;}
}
class Bob extends Builder{
    public void buildNick(){player.setNick("Bob");}
    public void buildLevel(){player.setLevel(5);}
    public void buildMoney(){player.setMoney(2000);}
    public void buildFaction(){player.setFaction(Faction.FBI);}
}
class Darcy extends Builder{
    public void buildNick(){player.setNick("Darcy");}
    public void buildLevel(){player.setLevel(1);}
    public void buildMoney(){player.setMoney(26800);}
    public void buildFaction(){player.setFaction(Faction.NEWS);}
}
class Admin{
    Builder builder;
    public void setBuilder(Builder builder){this.builder = builder;}
    public Player buildPlayer(){
        builder.createPlayer();
        builder.buildNick();
        builder.buildLevel();
        builder.buildMoney();
        builder.buildFaction();
        Player player = builder.getPlayer();
        return player;
    }
}