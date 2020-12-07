package jp.ac.uryukyu.ie.e205713;

public class Warrior extends Hero{
    /**
     * 名前、HP、攻撃力を指定するコンストラクタ。
     * @param name Warriorの名前
     * @param HP Warriorの体力
     * @param attack Warriorの攻撃力
     */
    public Warrior(String name, int hp, int attack){
        super(name, hp, attack);
    }

    /**
     * attack値の1.5倍固定で攻撃するメソッド
     * @param opponent 攻撃対象
     */
    public void attackWithWeponSkill(LivingThing opponent){
        if (hitPoint > 0) {
            int damage = (int) (attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.name, damage);
            opponent.wounded(damage);
        }
    }
}
