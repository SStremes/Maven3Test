package be.kdg.mavendemo;

import org.junit.*;
import static org.junit.Assert.assertEquals;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19-12-11
 */
public class TestCirkel {
    private Cirkel cirkel;
    private Cirkel andereCirkel;

    /**
     * Initialisatie. Maakt 2 Cirkel objecten.
     */
    @Before
    public void init() {
        cirkel = new Cirkel(2);
        andereCirkel = new Cirkel(3);
    }

    /**
     * Test de omtrek van 2 Cirkel objecten
     */
    @Test
    public void omtrek() {
        double omtrek = 2 * Math.PI * 2;
        double andereOmtrek = 2 * Math.PI * 3;

        assertEquals("De omtrek moet " + omtrek + " zijn", omtrek, cirkel.omtrek(), 1e-10);
        assertEquals("De omtrek moet " + andereOmtrek + " zijn", andereOmtrek, andereCirkel.omtrek(), 1e-10);
    }

    /**
     * Test de oppervlakte van 2 Cirkel objecten
     */
    @Test
    public void oppervlakte() {
        double oppervlakte = Math.PI * 2 * 2;
        double andereOppervlakte = Math.PI * 3 * 3;

        assertEquals("De oppervlakte moet " + oppervlakte + " zijn", oppervlakte, cirkel.oppervlakte(), 1e-10);
        assertEquals("De oppervlakte moet " + andereOppervlakte + " zijn",
                andereOppervlakte, andereCirkel.oppervlakte(), 1e-10);
    }
}
