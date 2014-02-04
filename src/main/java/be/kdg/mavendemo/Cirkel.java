package be.kdg.mavendemo;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19-12-11
 */
public class Cirkel implements Figuur {
    private final double straal;

    /**
     * Maakt een nieuw Cirkel object.
     * @param straal De straal
     */
    public Cirkel(double straal) {
        this.straal = straal;
    }

    /**
     * Geeft de oppervlakte van de cirkel terug.
     * @return double De oppervlakte
     */
    public double oppervlakte() {
        return Math.PI * straal * straal;
    }

    /**
     * Geeft de omtrek van de cirkel terug.
     * @return double De omtrek
     */
    public double omtrek() {
        return 2 * Math.PI * straal;
    }
}
