public class PoisonMatango extends Matango {
    int poisonCount = 5;
    public PoisonMatango(char suffix) {
        super(suffix);
    }
    public void attack(Hero h) {
        super.attack(h);
        if(this.poisonCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int poisondamege = h.hp / 5;
            h.hp -= poisondamege;
            System.out.println(poisondamege + "のダメージ！");
            this.poisonCount--;
            System.out.println("勇者の残りのHPは" + h.hp + "。");
        }
    }
}
