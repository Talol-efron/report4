package jp.ac.uryukyu.ie.e205713;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
     * Warriorクラスからオブジェクトを生成し、
     * attackWithWeponSkillを3回実行し、
     * 3回ともattackの150%ダメージになっていることを確認する
     */
    @Test
    void attackTest() {
        int defaultWarriorAttack = 100;
        Warrior demoWarrior = new Warrior("デモ勇者", 100, defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", 150, 10);
        for (int i=0;i<3;i++){
            slime.hitPoint = 150;
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(slime.hitPoint, 0);
        }
    }
}
