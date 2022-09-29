package day03;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir tamsayı al
        konsolda -128 ile +127 arasında sonuç yazdıracak
        kod yazınız

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int girilenSayi=scan.nextInt();

        byte donüsenSayi= (byte) girilenSayi;

        System.out.println("girdiğiniz  " + girilenSayi +"'nin donusmus hali : " + donüsenSayi);
    }
}
