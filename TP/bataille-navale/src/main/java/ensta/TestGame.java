import java.util.List;
import java.util.ArrayList;

public class TestGame{
    public static void main(String[] args){
        Board board=new Board("ai board");

        board.print();

        List<AbstractShip> ships=new ArrayList<AbstractShip>();
        Destroyer D=new Destroyer();
        ships.add(D);
        Submarine S=new Submarine();
        ships.add(S);
        S=new Submarine();
        ships.add(S);
        Carrier C=new Carrier();
        ships.add(C);
        Battleship B=new Battleship();
        ships.add(B);

        BattleShipsAI ai=new BattleShipsAI(board,board);
        ai.putShips(ships.toArray(new AbstractShip[0]));

        int i=0;

        int coord[]={0,0};
        
        while(i<5){
            Hit hit=ai.sendHit(coord);
            if(hit!=Hit.STRIKE && hit!=Hit.MISS){
                i++;
            }
            System.out.println("Le résultat de la frappe en ("+coord[0]+","+coord[1]+") est "+hit);
            System.out.println();
            board.print();

        }

    }
}