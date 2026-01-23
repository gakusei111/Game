public class Matango {
    int hp;
    char suffix;
    final int LEVEL = 10;

    public Matango(char suffix) {
        this.suffix = suffix;
    }

    public void attack(Hero h) {
        System.out.println("キノコ" + this.suffix + "の攻撃！");
        h.hp -= 10;
        System.out.println("10のダメージ！");
    }

    public void run() {
        System.out.println("キノコ" + this.suffix + "は逃げ出した！");
    }
}
