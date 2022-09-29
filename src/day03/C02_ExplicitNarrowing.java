package day03;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi=20;

        short s= (short) sayi;
        System.out.println(s);


        sayi=128;//int

        byte byt= (byte) sayi;

        System.out.println(byt);

    }
}
