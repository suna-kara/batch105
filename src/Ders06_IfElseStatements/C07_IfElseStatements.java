package Ders06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir harf isteyin,
        girilen karakter küçükse büyük olarak yazdırın
        yoksa girilen harfi yazdırın
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz:");
        char chr=scan.next().charAt(0);

        if (chr >='a' && chr<= 'z'){
            System.out.println((char) (chr-32)); // küçük harf girildi demek
        }else{

            // küçük harf değil demek
            System.out.println(chr);
        }
    }
}
