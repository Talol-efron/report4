package jp.ac.uryukyu.ie.e205713;


/**
 * 敵クラス。 String name; //敵の名前 int hitPoint; //敵のHP int attack; //敵の攻撃力 boolean
 * dead; //敵の生死状態。true=死亡。 Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{
    /**
     * 名前、HP、攻撃力を指定するコンストラクタ
     * @param name 敵の名前
     * @param hp 敵の体力
     * @param attack 敵の攻撃力
     */
    public Enemy(String name, int hp, int attack){
        super(name, hp, attack);
    }
}