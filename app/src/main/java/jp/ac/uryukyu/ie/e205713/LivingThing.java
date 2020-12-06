package jp.ac.uryukyu.ie.e205713;

/**
 * LivingThingクラス。
 * String name; //名前
 * int hitPoint; //HP
 * int attack; //攻撃力
 * boolean dead; //生死状態。true = 死亡。
 * Created by talol on 2020/12/6.
 */
public abstract class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    /**
     * 名前、体力、攻撃力を指定するコンストラクタ。
     * @param name 名前
     * @param hitpoint 体力
     * @param attack 攻撃力
     */
    LivingThing(String name, int hitpoint, int attack){
        this.name = name;
        this.hitPoint = hitpoint;
        this.attack = attack;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }
   
    /**
     * deadのgetterメソッド
     */
    public boolean isDead() {
        return this.dead;
    }

    /**
     * nameのgetterメソッド
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * HP > 0 の場合にランダムで相手を攻撃するメソッド。
     * 
     * @param opponent
     */
    public void attack(LivingThing opponent) {
        if (hitPoint > 0) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.name, damage);
            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * 
     * @param damage
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
}
