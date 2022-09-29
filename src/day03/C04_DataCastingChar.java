package day03;

import java.util.Scanner;

public class C04_DataCastingChar {
    public static void main(String[] args) {
        System.out.println('a' + 'b');// 97 + 98

        /*
        kullanıcıdan char bi karakter al
        o karakterden sonra gelen 3 karakter
         yazdır
         örn: input: a output: bcd
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");

        char girilenKrk=scan.next().charAt(0);
        System.out.println(""+(char)(girilenKrk+1) +(char)(girilenKrk+2) + (char)(girilenKrk+3));

    }
}
