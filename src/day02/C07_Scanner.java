package day02;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki
        // formmatta yazdirin.Isminiz : JohnSoyisminiz :
        // DoeYasiniz : 44Kaydiniz basariyla tamamlanmistir.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz : ");

        // String için kullanılan next() sadece ilk space e kadar olan kısmı alır.
        //                         nextLine() ise o satırda yazılan tüm bilgiyi alır.

        String isim=scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz: ");

        String soyİsim=scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz: ");
        double yas=scan.nextDouble();


        System.out.println("isminiz: "+ isim + "\nsoyisminiz : " + "\nYaşınız: " +yas+
                "\nKaydınız basariyla tamamlanmıştır.");
    }
}
