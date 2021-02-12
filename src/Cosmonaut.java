public class Cosmonaut extends Human {
    public Cosmonaut(String name) {
        setName(name);
    }

    protected void fall() {
        System.out.print("упали");
    }
}
