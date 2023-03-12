package Starcraft;

public class Zergling{

    //상태
    int damage;
    int hp;
    String name;
    int speed;


    public Zergling(int damage, int hp, String name, int speed){
        this.damage = damage;
        this.hp = hp;
        this.name = name;
        this.speed = speed;


    }



    //행위
    public int attack(){
        return damage;
    }
    public void damageUp(){
        this.damage = this.damage +1;
    }
    public void speedUp(){
        this.speed = this.speed +1;
    }

    public int getDamage() {
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void risk(int enemyDamage){
        hp = hp - enemyDamage;
    }

    public int getHP(){
        return hp;
    }
}