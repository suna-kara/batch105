package day02;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //bir dikdörtgenin 2 kenar uzunluğunu alıp dikdörtgenin alanını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin iki kenar uzunluğunu girin " +
                "\niki enar uzunluğu arasında enter a basın");

        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();

        System.out.println("dikdörtgenin alanı = " + (kenar2*kenar1));
    }
}
