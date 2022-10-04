package Ders06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {

    public static void main(String[] args) {
        // Kullanıcıdan bir karakter girmesini isteyin
        // Girilen karakterin büyük harf olup olmadığını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz:");
        char chr=scan.next().charAt(0);

        if (chr >='A' && chr<= 'Z'){
            System.out.println("Buyuk harf");
        }else{
            System.out.println("Buyuk Harf değil");
        }

    }
}
