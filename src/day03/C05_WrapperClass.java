package day03;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi=10;
        String str="Java çok güzel";

        /*
        primitive data türleri sadece değer barındırırlar,
        hazır metotları yoktur.

        Javaya yapılan talepler üzerine java
        primitive data türleri ile bazı hazır metotların kullanılabilmesi için Wrapper class lar oluşturulmuştur.

        Wrapper class lar primitive data türlerindeki değerleri alırlar ancak
        metot ları da vardır.
         */

        char krk='b';
        Character krkWrapper='c';
        System.out.println(Character.isLetter('5')); // false

        System.out.println(Character.isDigit('7')); // true

        String str1="123";
        String str2="12";

        // str1 ve str2 nin değerlerini matematiksel olarak topla

        System.out.println(str1+str2); // 12312 birleştirdi

        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2)); //135

        // Integer.parseInteger(str) içine yazılan str rakamlardan oluşuyorsa str ı int a çevirir

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
    }
}
