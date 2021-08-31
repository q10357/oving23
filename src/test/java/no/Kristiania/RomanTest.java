package no.Kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {

    @Test
    void shuldTranslateOneToI(){
        assertEquals("I", toRoman(1));
    }

    private static String toRoman(int number) {
        String romanNumber = "";
        while(number >= 3) {
            if (number == 4) {
                number = 0;
                romanNumber += "IV";
            }else if (number == 9) {
                number = 0;
                romanNumber += "IX";
            }else if (number >= 1000){
                number = number - 1000;
                romanNumber += "M";
            }else if (number >= 500){
                number = number - 500;
                romanNumber += "D";
            }else if (number >= 100){
                number = number - 100;
                romanNumber += "C";
            }else if (number >= 50){
                number = number - 50;
                romanNumber += "L";
            }else if (number >= 10) {
                number = number - 10;
                romanNumber += "X";
            }else if (number >= 5 && number < 10) {
                number = number - 5;
                romanNumber += "V";
            }
        }
        for (int i = 0; i < number; i++) {
            romanNumber += "I";
        }
        System.out.println(romanNumber);
        return romanNumber;
    }
}
