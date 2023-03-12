package Starcraft;

public class Main {
    public static void  main(String[] args) {

        Marin marin1 = new Marin(5, 30,"마린1",5);
        Zergling zergling1 = new Zergling(3,20,"저글링1",5);
        Zealot zealot1 = new Zealot(10,20,"질럿1",10,3);

        //마린1이 질럿1 공격
        int x = marin1.attack();
            zealot1.risk(5);

        //저글링1이 마린 1 공격
        int y = zergling1.attack();
            marin1.risk(3);

        //질럿1이 저글링1 공격
        int z = zealot1.attack();
            zergling1.risk(10);






    }
}