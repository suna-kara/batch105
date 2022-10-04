package Ders06_IfElseStatements;

import java.util.Scanner;

public class C03_ElseIfStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ucgenin 3 kenarını giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eşkenar üçgen");
        }else{
            System.out.println("üçgen değil");
        }
    }
}
