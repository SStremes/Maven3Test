package be.kdg.mavendemo;

import org.junit.*;
import static org.junit.Assert.assertEquals;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19-12-11
 */
public class TestRechthoek {
    private Rechthoek rechthoek;
    private Rechthoek andereRechthoek;

    /**
     * Initialisatie. Maakt 2 Rechthoek objecten.
     */
    @Before
    public void init() {
        rechthoek = new Rechthoek(2, 3);
        andereRechthoek = new Rechthoek(3, 4);
    }

    /**
     * Test de omtrek van 2 Rechthoek objecten
     */
    @Test
    public void omtrek() {
        assertEquals("De omtrek moet 10 zijn", 10, rechthoek.omtrek(), 1e-10);
        assertEquals("De omtrek moet 14 zijn", 14, andereRechthoek.omtrek(), 1e-10);
    }

    /**
     * Test de omtrek van 2 Rechthoek objecten
     */
    @Test
    public void oppervlakte() {
        assertEquals("De oppervlakte moet 6 zijn", 6, rechthoek.oppervlakte(), 1e-10);
        assertEquals("De oppervlakte moet 12 zijn", 12, andereRechthoek.oppervlakte(), 1e-10);
    }
}
