import java.util.Objects;

public class Hit implements IHit {
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }

    public void isHeard(){
        System.out.print("Послышался звонкий ");
    }
    public void was(){
        System.out.print(" был");
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Hit other = (Hit) obj;
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
