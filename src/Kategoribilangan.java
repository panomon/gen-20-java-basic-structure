import java.util.Scanner;

public class Kategoribilangan {
    public static String KategoriBilangan (int hasil){
        if (hasil % 2 == 0) {
            return "genap";
        }
        else {
            return "ganjil";
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan ke 1 : ");
        int bilangan1 = input.nextInt();
        System.out.println("Masukkan bilangan ke 2 : ");
        int bilangan2 = input.nextInt();
        int jumlah = bilangan1 + bilangan2;
        int hasil = jumlah + 1;
        String kategori = KategoriBilangan(hasil);
        System.out.println("Hasil penjumlahan " + bilangan1 + " dan " + bilangan2 + " adalah " + jumlah);
        System.out.println("Hasilnya ditambah 1 adalah " + hasil);
        System.out.println(" Kategori bilangan " + hasil + " adalah " + kategori);
    }
}
