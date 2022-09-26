package day02;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdan imini alıp, büyük harflerle yazdırın

        // 1. adım Scan objesi oluşturma
        Scanner scan=new Scanner(System.in);

        //2. adım kullanıcıya ne istediğimizi yazdırma
        System.out.println("Lütfen adınızı giriniz : ");

        //3. adım : kullanıcıdan istedğmz bilginin türüne uygun bir variable oluşturma
        String kullanıcıAdı=scan.next();
        System.out.println(kullanıcıAdı.toUpperCase());
    }
}
