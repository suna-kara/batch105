package day02;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        // İnterview sorusu - Kullanıcıdan iki sayı alıp ikisinin değerlerini değiştirin(swap)
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Birinci sayıyı giriniz: ");
        int sayi1=scan.nextInt();

        System.out.println("Lütfen ikinci tamsayiyi giriniz: ");
        int sayi2=scan.nextInt();

        int bos;
        bos=sayi2;

        sayi2=sayi1;
        sayi1=bos;

        System.out.println("sayi1 in değeri: "+ sayi1);

        System.out.println("sayi2 nin değeri :" + sayi2);
    }
}
