package no.Kristiania;

import no.kristiania.Roman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {

    @Test
    void shouldTranslateOneToI(){
        assertEquals("I", Roman.toRoman(1));
    }

}
