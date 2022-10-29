package hipotenus;

import java.util.Scanner;

public class Hipo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double c;
        System.out.println("Birinci kenarı giriniz:");
        a = input.nextInt();
        System.out.println("İkinci kenarı giriniz:");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs:" +c);



    }

}
