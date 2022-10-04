package Ders06_IfElseStatements;

import java.util.Scanner;

public class C01_IfStatements {

    public static void main(String[] args) {
        //Kullanıcıdan bir harf alın, harsf ile başlayan bir ay varsa yazdırın.
        // Kullanıcı o veya O yazdığında output Ocak olsun.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ay isminin ilk harfini girin:");

        char ilkHarf=scan.next().charAt(0);

        if (ilkHarf=='o' || ilkHarf=='o'){
            System.out.println("Ocak");
        }
        if (ilkHarf=='s' || ilkHarf=='S'){
            System.out.println("Subat");
        }if (ilkHarf=='m' || ilkHarf=='M'){
            System.out.println("Mart");
        }
        if (ilkHarf=='n' || ilkHarf=='N'){
            System.out.println("Nisan");
        }
        if (ilkHarf=='m' || ilkHarf=='M'){
            System.out.println("Mayıs");
        }
        if (ilkHarf=='h' || ilkHarf=='H'){
            System.out.println("Haziran");
        }
        if (ilkHarf=='t' || ilkHarf=='T'){
            System.out.println("Temmuz");
        }
        if (ilkHarf=='a' || ilkHarf=='A'){
            System.out.println("Ağustos");
        }
        if (ilkHarf=='e' || ilkHarf=='E'){
            System.out.println("Eylül");
        }
        if (ilkHarf=='e' || ilkHarf=='E'){
            System.out.println("Ekim");
        }
        if (ilkHarf=='k' || ilkHarf=='K'){
            System.out.println("Kasım");
        }
        if (ilkHarf=='a' || ilkHarf=='A'){
            System.out.println("Aralık");
        }


    }

}
