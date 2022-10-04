package Ders06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        // Kullanıcıdan yasını isteyin,65 ve üzeri ise emekli olabilirim yazdırın
        // yoksa emekli olması için çalışması gereken yıl sayısını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz:");
        double yas=scan.nextDouble();

        if (yas>=65){
            System.out.println("Yasınız emeklilik için yeterli");
        }else{
            System.out.println("emekli olmak için" + (65-yas)+ " sene daha çalışmalısın");
        }
    }
}
