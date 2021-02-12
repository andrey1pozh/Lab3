public class Rocket implements IRocket {
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }

    public void Shake(){
        System.out.println(" вздрогнула");
    }

    public void LoseControl(){
        System.out.print(" потеряла");
    }

    public void RollOver(){
        System.out.print(" перевернулась");
    }

    public void weightlessness(){
        System.out.println(" находилась в состоянии невесомости");
    }
}
