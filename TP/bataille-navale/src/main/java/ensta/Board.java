package ensta;

public class Board implements IBoard {
    private String name;
    private int size;
    private char[][] ships;
    private boolean[][] hits;

    public Board(String name, int size){
        this.name=name;
        this.size=size;
        ships=new char[size][size];
        hits=new boolean[size][size];
    }

    public Board(String name){
        this(name,10);
    }

    public void print(){

        int code_A=(int)'A';
        System.out.print("   ");
        for(int j=0;j<size;j ++){
            System.out.print((char)(code_A+j));
            System.out.print(" ");
        }

        System.out.print("    ");
        for(int j=0;j<size;j ++){
            System.out.print((char)(code_A+j));
            System.out.print(" ");
        }
        System.out.println();

        for (int i=0; i<size; i++){
            if(i<10) System.out.print(" ");
            System.out.print(i);
            System.out.print(" ");
            for(int j=0;j<size ; j++){
                char x=ships[i][j];
                if(x=='D' || x=='S' || x=='B' || x=='C'){
                    System.out.print(x);
                }
                else{
                    System.out.print('.');
                }
                System.out.print(" ");
            }
            System.out.print(" ");
            if(i<10) System.out.print(" ");
            System.out.print(i);
            System.out.print(" ");
            for(int j=0;j<size ; j++){
                
                if(hits[i][j]){
                    System.out.print('x');
                }
                else{
                    System.out.print('.');
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return (size);
    }

    void putShipAux(AbstractShip ship, int x, int y, int ix, int iy){
        for (int i=0; i<ship.getSize() ; i++){
            ships[x+ix*i][y+iy*i]=ship.getLabel();
        }
    }

    public void putShip(AbstractShip ship, int x, int y) {
        switch (ship.getOrientation()) {
        case Orientation.EAST:
            try {
                putShipAux(ship, x, y, 1, 0);
            } catch (Exception e) {
                // TODO: handle exception
            }
            ;
            break;
        case Orientation.NORTH:
            ;
            break;
        case Orientation.SOUTH:
            ;
            break;
        case Orientation.WEST:
            ;
            break;
        }
    }

    @Override
    public boolean hasShip(int x, int y) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setHit(boolean hit, int x, int y) {
        // TODO Auto-generated method stub

    }

    @Override
    public Boolean getHit(int x, int y) {
        // TODO Auto-generated method stub
        return null;
    }
}