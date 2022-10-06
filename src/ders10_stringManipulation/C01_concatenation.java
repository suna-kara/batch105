package ders10_stringManipulation;

public class C01_concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzeldir.";
        boolean bl=true;
        int sayi=20;
        double dbl=3.54;

        System.out.println(str1+bl+sayi); // Javatrue20

      //  System.out.println(bl+sayi);
        //String dısındaki data türlerine toplama yapmamıza izin vermeyebilir

        System.out.println(sayi+dbl);

       // System.out.println(str1.concat(bl));
        //concat sadece string variable ları birleştirir

        System.out.println(str1.concat(" ")+str2);
    }
}
