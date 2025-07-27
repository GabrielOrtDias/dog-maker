public class Dog extends Animals implements Sound {
    String race;

    public Dog(String name, int age, String owner, String race){
        super(name, age, owner);
        this.race = race;
    }

    @Override
    public void sound() {
        System.out.println("woof woof");
    }
}
