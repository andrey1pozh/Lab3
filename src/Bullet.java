public class Bullet extends Thing{
    public Bullet(String name) {
        setName(name);
    }

    protected void NoPunch(){
        System.out.print(" не пробила");
    }
}
