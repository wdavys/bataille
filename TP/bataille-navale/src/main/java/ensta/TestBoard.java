//package ensta;

import java.util.List;
import java.util.ArrayList;


public class TestBoard{
    public static void main(String args[]){
        Board test=new Board("plateau test");
        Board test_opponent=new Board("opponent test");

        List<AbstractShip> ships=new ArrayList<AbstractShip>();
        for (int i=0; i<5 ; i++){
            Destroyer des=new Destroyer();
            ships.add(des);
        }


        Player player_test=new Player(test,test_opponent,ships);
        player_test.putShips();

        System.out.println(test.sendHit(3,4));
        System.out.println(test.sendHit(3,3));
        test.print();

    }
}