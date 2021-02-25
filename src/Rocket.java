import java.util.Objects;

public class Rocket implements IRocket {
    private static int HP = 100;
    private String Name;

    public static void hpBar(String Material){
        if (Material.equals("steal")){
            System.out.print(" не пробила");
        }
        else{
            HP -= 20;
            System.out.print(" пробила");
        }
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.Name;
    }

    public void shake(){
        System.out.println(" вздрогнула");
    }

    public void loseControl(){
        System.out.print(" потеряла");
    }

    public void rollOver(){
        System.out.print(" перевернулась");
    }

    public void weightlessness(){
        System.out.println(" находилась в состоянии невесомости");
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Rocket other = (Rocket) obj;
                return Objects.equals(this.Name, other.Name);
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.Name});
    }

    public String toString() {
        return this.Name;
    }
}
