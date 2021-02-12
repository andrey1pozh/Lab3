public class Main {

    public static void main(String[] args) {
        String timeName = Any.TIME.getName();
        String inrName = Any.INR.getName();
        String controlName = Any.CONTROL.getName();
        String inairName = Any.INAIR.getName();
        String steelName = Any.STEEL.getName();
        String feelName = Any.FEEL.getName();
        String pathName = Any.PATH.getName();
        String placeName = Any.PLACE.getName();

        Policeman policeman = new Policeman(" полицейский");
        Hit hit = new Hit();
        hit.setName("удар");
        Rocket rocket = new Rocket();
        rocket.setName("Ракета");
        Bullet bullet = new Bullet("Пуля");
        Cosmonaut cosmonaut = new Cosmonaut("космонавт");
        Confusion confusion = new Confusion("замешательство");

        System.out.print(timeName);
        System.out.print(policeman.getName());
        policeman.shoot();
        System.out.println(inrName);

        hit.IsHeard();
        System.out.println(hit.getName());

        System.out.print(rocket.getName());
        rocket.Shake();
        System.out.print(rocket.getName());
        rocket.LoseControl();
        System.out.println(controlName);
        System.out.print(rocket.getName());
        rocket.RollOver();
        System.out.println(inairName);

        System.out.print(bullet.getName());
        bullet.NoPunch();
        System.out.println(steelName);

        System.out.print(rocket.getName());
        rocket.weightlessness();

        System.out.print(hit.getName());
        hit.Was();
        System.out.println(feelName);

        System.out.print(pathName + cosmonaut.getName() + "ы ");
        cosmonaut.fall();
        System.out.println(placeName);

        confusion.Happen();
        System.out.print(confusion.getName());
    }
}
