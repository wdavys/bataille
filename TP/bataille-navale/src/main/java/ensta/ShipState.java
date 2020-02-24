//package ensta;

//import ensta.ship_class.*;

public class ShipState{
    private AbstractShip ship;
    private boolean struck;

    ShipState(AbstractShip ship){
        this.ship=ship;
        struck=false;
    }

    public void addStrike(){
        struck=true;
        this.ship.addStrike();
    }

    public boolean isStruck(){
        return(struck);
    }

    public String toString(){
        if (struck){
            return(ColorUtil.colorize(ship.getLabel(),ColorUtil.Color.RED));
        }
        else {
            return(""+ship.getLabel());
        } 
    }

    public AbstractShip getShip(){
        return(ship);
    } 

    public void setShip(AbstractShip ship){
        this.ship=ship;
    }
}