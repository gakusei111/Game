public class Main {
    public static void main(String[] args) {
        // Create a Hero instance
        // Set the name and hp attributes
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");
        // Create a Matango instance
        // Set the suffix attribute
    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';
        // The Beginning of the Adventure
        h.slip();
        m1.run();
        m2.run();
        h.run();
    }
}