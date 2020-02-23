public class ShipState{
    private AbstractShip ship;
    private boolean struck;

    ShipState(AbstractShip ship){
        this.ship=ship;
        struck=false;
    }

    public void addStrike(){
        struck=true;
    }

    public boolean isStruck(){
        return(struck);
    }

    public String toString(){
        if (struck){
            return(colorize(ship.getLabel(),RED));
        }
        else {
            return(ship.getLabel());
        } 
    }

    public AbstractShip getShip(){
        return(ship);
    } 
}