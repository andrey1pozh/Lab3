public class Hit implements IHit {
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }

    public void IsHeard(){
        System.out.print("Послышался звонкий ");
    }
    public void Was(){
        System.out.print(" был");
    }
}
