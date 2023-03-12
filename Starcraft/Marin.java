package Starcraft;

public class Marin{

    //상태
    int damage;
    int hp;
    String name;
    int speed;



    public Marin(int damage, int hp, String name, int speed){
        this.damage = damage;
        this.hp = hp;
        this.name = name;
        this.speed = speed;

    }



    //행위


    public int attack(){
        return damage;
    }

    public void risk(int enemyDamage){
        hp = hp - enemyDamage;
    }

    public  void damageUp(){
        this.damage = this.damage +1;
    }
    public void speedUp(){
        this.speed = this.speed + 1;
    }
    public void steamPack(){

        if(hp <= 5){
            System.out.println("steamPack을 사용할 수 없습니다.");
        }else {
            this.hp = this.hp - 5;
            this.speed = this.speed + 2;
            this.damage = this.damage + 3;
        }

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


    public int getHP(){
        return hp;
    }
}