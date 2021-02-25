import java.util.Objects;

public class Cosmonaut extends Human {
    private String name;
    public Cosmonaut(String name) {
        setName(name);
    }

    protected void fall() {
        System.out.print("упали");
    }
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Cosmonaut other = (Cosmonaut) obj;
                return Objects.equals(this.name, other.name);
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name});
    }

    public String toString() {
        return this.name;
    }
}
