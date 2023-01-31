public class Drago extends Animal {
    private  String ability;
    private int age;

    public String getAbility() {
        return ability;
    }

    public int getAge() {
        return age;
    }

    public Drago(String name, String ability, int age) {
        super(name);
        this.ability=ability;
        this.age=age;
    }

    @Override
    public void print() {
        System.out.println(getName()+" "+getAbility()+" "+getAge());
    }
}
