import java.util.Objects;

public abstract class Human {
    private String Name;

    public Human() {
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.Name;
    }

    protected void shoot() {
    }

    protected void fall() {
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Human other = (Human)obj;
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
