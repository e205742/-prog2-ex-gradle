package jp.ac.uryukyu.ie.e205742;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test 
    void attackWithWeponSkill(){
        int preHp;
        Warrior warrior = new Warrior("ロト",100,10);
        Enemy enemy = new Enemy("ドラキー",60,20);
        for (int i=0 ; i<3 ; i++){
            preHp=enemy.hitPoint;
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
            assertEquals(preHp-enemy.hitPoint, (int)(warrior.attack*1.5)   );

        }    

        
    }
}
