package be.kdg.mavendemo;

import org.junit.*;
import static org.junit.Assert.assertEquals;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19-12-11
 */
public class TestVierkant {
    private Vierkant vierkant;
    private Vierkant andereVierkant;

    /**
     * Initialisatie. Maakt 2 Cirkel objecten.
     */
    @Before
    public void init() {
        vierkant = new Vierkant(2);
        andereVierkant = new Vierkant(3);
    }

    /**
     * Test de omtrek van 2 Vierkant objecten
     */
    @Test
    public void omtrek() {
        assertEquals("De omtrek moet 8 zijn", 8, vierkant.omtrek(), 1e-10);
        assertEquals("De omtrek moet 12 zijn", 12, andereVierkant.omtrek(), 1e-10);
    }

    /**
     * Test de oppervlakte van 2 Vierkant objecten
     */
    @Test
    public void oppervlakte() {
        assertEquals("De oppervlakte moet 4 zijn", 4, vierkant.oppervlakte(), 1e-10);
        assertEquals("De oppervlakte moet 9 zijn", 9, andereVierkant.oppervlakte(), 1e-10);
    }
}
