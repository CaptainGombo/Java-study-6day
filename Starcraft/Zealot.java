package Starcraft;

public class Zealot{

    //상태
    int damage;
    int hp;
    String name;
    int shield;
    int speed;


    public Zealot(int damage, int hp, String name, int shield, int speed){
        this.damage = damage;
        this.hp = hp;
        this.name = name;
        this.shield = shield;
        this.speed = speed;
    }


    //행위
    public int attack(){
        return damage;
    }



    public void risk(int enemyDamage){
        if(shield >0) {
            shield = shield - enemyDamage;
        }else{
            hp = hp - enemyDamage;
        }

    }
    public void shieldUp(){
        this.shield = this.shield + 1;
    }
    public void damageUp(){
        this.damage = this.damage +1;
    }
    public void speedUp(){
        this.speed = this.speed +1;
    }

    public int getSpeed() {
        return speed;
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

    public int getShield() {
        return shield;
    }
}