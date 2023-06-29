public class Rodent extends Animal {
    Rodent(String code, String name, String kind, int weight, int maxAge) {
        super(code, name, kind, weight, maxAge);

        System.out.println("Created a new animal of kind Rodent");
    }

    public void Eat() {
        System.out.println("I am a rodent with name " + this.m_name + " and code " + this.m_code + " and I am going to eat!");
    }
}
