package T3H.opp.Class1;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String Speak(){
        return "muốn kêu nào thì kêu";
    }
}
