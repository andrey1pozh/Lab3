import java.util.Objects;

public class Confusion extends Thing{
    private String name;
    public Confusion(String name) {
        setName(name);
    }

    protected void happen(){
        System.out.print("Произошло ");
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Confusion other = (Confusion) obj;
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
