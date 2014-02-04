package be.kdg.mavendemo;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19-12-11
 */
public class Vierkant implements Figuur {
    private final double zijde;

    /**
     * Constructor om een nieuw Vierkant object te maken.
     * @param zijde De zijde
     */
    public Vierkant(double zijde) {
        this.zijde = zijde;
    }

    /**
     * Geeft de omtrek van het vierkant terug.
     * @return double De omtrek
     */
    public double omtrek() {
        return 4 * (zijde);
    }

    /**
     * Geeft de oppervlakte van het vierkant terug.
     * @return double De oppervlakte
     */
    public double oppervlakte() {
        return zijde * zijde;
    }
}
