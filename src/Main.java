public class Main {
    public static void main(String[] args) {
        Dog tobby = new Dog("Tobby", 9, "Luiz", "Akita");
        System.out.println("name: "+ tobby.name + " age: " + tobby.age + " owner: " + tobby.owner + " race: " + tobby.race);
        tobby.sound();
    }
}
