package Ders06_IfElseStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        // Kullanıcıdan bir üçgenin 3 kenar uzunluğnu alın,
        // üçgen eşkenar ise "Eşkenar üçgen" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ucgenin 3 kenarını giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eşkenar üçgen");
        }
    }
}
