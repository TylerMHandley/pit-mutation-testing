package pitapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testHappyPath() {
        assertTrue(App.isAnagram("listen", "silent"));
    }
    // @Test
    // public void testSadPath(){
    //     assertFalse(App.isAnagram("Tyler", "Handley"));
    // }
    // @Test
    // public void testSadderPath(){
    //     assertFalse(App.isAnagram("Hunter", "Murphy"));
    // }
}
