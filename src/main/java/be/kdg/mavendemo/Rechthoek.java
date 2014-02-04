package be.kdg.mavendemo;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19-12-11
 */
public class Rechthoek implements Figuur{
    private final double breedte;
    private final double hoogte;

    /**
     * Constructor om een nieuw Rechthoek object te maken.
     * @param breedte De breedte
     * @param hoogte De hoogte
     */
    public Rechthoek(double breedte, double hoogte) {
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    /**
     * Geeft de omtrek van de rechthoek terug.
     * @return double De omtrek
     */
    public double omtrek() {
        return 2 * (breedte + hoogte);
    }

    /**
     * Geeft de oppervlakte van de recnthoek terug.
     * @return double De oppervlakte
     */
    public double oppervlakte() {
        return breedte * hoogte;
    }
}
