package ensta;

abstract class AbstractShip {
    private final char label;
    private final String nom;
    private final int taille;
    private Orientation orientation;

    public char getLabel() {
        return label;
    }

    public String getNom() {
        return nom;
    }

    public int getTaille() {
        return taille;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(final Orientation orientation) {
        this.orientation = orientation;
    }

    

    public AbstractShip(final String nom, final char label, final int taille, final Orientation orientation) {
        this.nom =  nom;
        this.label = label;
        this.taille = taille;
        this.orientation = orientation;
    }
}