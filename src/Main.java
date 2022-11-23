import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler
        int select, n1, n2;

        //GİRDİLER

        Scanner input = new Scanner(System.in);

        System.out.println("1. SAYIYI GİRİNİZ: ");
        n1 = input.nextInt();
        System.out.println("2. SAYIYI GİRİNİZ: ");
        n2 = input.nextInt();

        System.out.println("YAPILACAK İŞLEMİN TÜRÜNÜ GİRİNİZ (1:+ 2:- 3:* 4:/)");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("SONUÇ: " + (n1 + n2));
                break;
            case 2:
                System.out.println("SONUÇ: " + (n1 - n2));
                break;
            case 3:
                System.out.println("SONUÇ: " + (n1 * n2));
                break;
            case 4:
                System.out.println("SONUÇ: " + (n1 / n2));
                break;
            default:
                System.out.println("LÜTFEN GEÇERLİ BİR İŞLEM SEÇİNİZ!");
        }
    }
}