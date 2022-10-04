package Ders06_IfElseStatements;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        /*
        if else statement ta süslü parantez kullanmazsak
        hem if body si hem de else body si
        için sadece bir satır kabul eder

        sonraki satırlar if - else ile ilişkilendirilmez
        her durumda çalışır
         */
        int not=56;

        if (not>=50)
            System.out.println("sinifi gectin");
           // System.out.println("Yazin kafan rahat");
        else
            System.out.println("Bu dersten kaldın");
            System.out.println("Yaz okuluna bekleriz :) ");

    }
}
