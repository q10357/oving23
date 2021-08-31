package no.kristiania;

import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        System.out.println("hello world, write your desired roman number in integer");
        Scanner scanner = new Scanner(System.in);

        int numberInput = scanner.nextInt();
        String romanNumber = toRoman(numberInput);
        System.out.printf("%d in roman notation is %s", numberInput, romanNumber);
    }

    public static String toRoman(int number) {
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
