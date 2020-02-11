import com.sun.org.apache.regexp.internal.recompile;

abstract class AbstractShip {
    private final char label;
    private final String nom;
    private final int size;
    private Orientation orientation;
    private int strikeCount;

    public void addStrike(){
        strikeCount++;
    }

    public boolean isStunk(){
        return(strikeCount==size);
    }

    public char getLabel() {
        return label;
    }

    public String getNom() {
        return nom;
    }

    public int getSize() {
        return size;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    

    public AbstractShip(String nom, char label, int size, Orientation orientation) {
        this.nom =  nom;
        this.label = label;
        this.size = size;
        this.orientation = orientation;
    }
}