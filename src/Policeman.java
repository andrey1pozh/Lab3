import java.util.Objects;

public class Policeman extends Human {
    private String name;
    public Policeman(String name) {
        setName(name);
    }

    protected void shoot() {
        System.out.print(" выстрелил");
    }
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Policeman other = (Policeman) obj;
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
