import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
     * byte Byte
     * short Short
     * int Integer
     * long Long
     * float Float
     * double Double
     * char Character
     * */
    public static void main(String[] args) {
        /*
        System.out.println("Hello world!");

        Hesaplama hesaplama = new Hesaplama();
        int toplama = hesaplama.topla(5);

        System.out.println("toplama: " + toplama);

        Matematik matematik = new Matematik();
        Matematik.Daire daire = matematik.new Daire();

        System.out.println("matematik: " + matematik.x);
        System.out.println("daire: " + daire.y);

        ArrayList<Integer> sayilarim = new ArrayList<>();
        Integer fiyat = 5;
        int yeniFiyat = fiyat.intValue(); // 5
        //dosyaSil();
        Listelemeler listelemeler = new Listelemeler();
        listelemeler.listele();
        */
        oyunOyna();

    }

    static void dosyaSil() {
        File file = new File("/Users/mehmetseyhan/Desktop/QA/Proje04/src/deger.txt");
        if (file.delete()) {
            System.out.println("dosya silindi");
        } else {
            System.out.println("Dosya Silinemedi");
        }

    }

    static void oyunOyna() {
        int mSayi = (int) (Math.random() * 100); // 0...1  0.25252  25
        System.out.println("mSayi + " + mSayi);

        Scanner scanner = new Scanner(System.in);
        int tahmin = 0;

        while (tahmin < 3) { // 0 1 2 3
            System.out.println("Lutfen tahmininizi giriniz");
            int oSayi = scanner.nextInt();
            if (oSayi == mSayi) {
                System.out.println("Kazandiniz");
                break;
            }
            tahmin++;
            if (tahmin == 3) {
                System.out.println("Kaybettiniz");
            } else {
                if (oSayi > mSayi) {
                    System.out.println("Daha kucuk bir sayi gir ");
                } else {
                    System.out.println("Daha buyuk bir sayi gir");
                }
            }
        }


    }

}