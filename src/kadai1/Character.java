package kadai1;

public abstract class Character {
    String name;
    int hp = 100;

    abstract void attack(Matango m);// {
        /*System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージをあたえた!");
    }*/

    public void run(){
        System.out.println(this.name + "は逃げだした！");
    }
}