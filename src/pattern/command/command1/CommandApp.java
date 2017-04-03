package pattern.command.command1;

/**
 * Created by alex on 03.04.2017.
 */
public class CommandApp {
    public static void main(){
        SuperAdmin admin = new SuperAdmin(new Kick(new Admin()), new Ban(new Admin()), new Delete(new Admin()), new Accept(new Admin()));

        admin.kickSuperAdmin();
        admin.banSuperAdmin();
        admin.deleteSuperAdmin();
        admin.acceptSuperAdmin();
    }
}
class Admin{
    public void kick(){
        System.out.println("asdf");
    }
    public void ban(){
        System.out.println("ggfff");
    }
    public void delete(){
        System.out.println("sddfasfa");
    }
    public void accept(){
        System.out.println("asdfjiasdfioa");
    }
}
interface Command{
    void execute();
}
abstract class CommandAbs implements Command{
    Admin admin;
}
class Kick extends CommandAbs{
    public Kick(Admin admin){
        this.admin = admin;
    }

    public void execute(){
        admin.kick();
    }
}
class Ban extends CommandAbs{
    public Ban(Admin admin){
        this.admin = admin;
    }

    public void execute(){
        admin.ban();
    }
}
class Delete extends CommandAbs{
    public Delete(Admin admin){
        this.admin = admin;
    }

    public void execute(){
        admin.delete();
    }
}
class Accept extends CommandAbs{
    public Accept(Admin admin){
        this.admin = admin;
    }

    public void execute(){
        admin.accept();
    }
}
class SuperAdmin{
    Command kick;
    Command ban;
    Command delete;
    Command accept;

    public SuperAdmin(Command kick, Command ban, Command delete, Command accept){
        this.kick = kick;
        this.ban = ban;
        this.accept = accept;
        this.delete = delete;
    }

    public void kickSuperAdmin(){
        kick.execute();
    }

    public void banSuperAdmin(){
        ban.execute();
    }

    public void deleteSuperAdmin(){
        delete.execute();
    }

    public void acceptSuperAdmin(){
        accept.execute();
    }
}









