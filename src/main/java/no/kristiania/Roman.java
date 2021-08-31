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




}
