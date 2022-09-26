package day02;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdanbir double, bir de int sayı alıp
        //bunların toplamını ve çarpımını yazdırın.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen ondalıklı bir sayı giriniz ");
        double ondalıklıSayı=scan.nextDouble();

        System.out.println("Lütfen bir tamsayı giriniz ");
        int tamSayi= scan.nextInt();

        System.out.println("Girilen sayıların toplamı = " + (tamSayi+ondalıklıSayı));
        System.out.println("Girilen sayıların çarpımı = " + (tamSayi*ondalıklıSayı));

        

    }


}
