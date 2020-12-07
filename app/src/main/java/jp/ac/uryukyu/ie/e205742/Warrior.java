package jp.ac.uryukyu.ie.e205742;

public class Warrior extends Hero {
    public void attackWithWeponSkill(LivingThing opponent){
        final int damage=(int)(super.attack*1.5);
        if(super.dead==false){
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！",super.name,opponent.getName() ,damage);
            opponent.wounded(damage);
        }

    }
    public Warrior(String name,int hitPoint,int attack){
        super(name,hitPoint,attack);
    }
}
