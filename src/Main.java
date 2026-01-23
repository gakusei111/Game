public final class Main {
    public static void main(String[] args) {
        // Create a Hero instance
        // Set the name and hp attributes
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");
        // Create a Matango instance
        // Set the suffix attribute
    Matango m1 = new Matango('A');
    m1.hp = 50;

    Matango m2 = new Matango('B');
    m2.hp = 48;

        //create PoisonMatango instance
    PoisonMatango pm = new PoisonMatango('C');
    pm.hp = 60;
    pm.attack(h);
    }
}