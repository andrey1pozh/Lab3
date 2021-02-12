public class Policeman extends Human {
    public Policeman(String name) {
        setName(name);
    }

    protected void shoot() {
        System.out.print(" выстрелил");
    }
}
