import java.util.Scanner;

public class Aritmatika {
    public static void main (String[] args) {
        System.out.println("Masukkan 2 angka: ");
        Scanner input = new Scanner(System.in); // membuat input
        double angka1 = input.nextDouble(); // membaca input dari user
        double angka2 = input.nextDouble(); // membaca input dari user
        double jumlah = angka1 + angka2;
        double kurang = angka1 - angka2;
        double kali = angka1 * angka2;
        double bagi = angka1 / angka2;
        System.out.println("Penjumlahan 2 angka : " + jumlah);
        System.out.println("Pengurangan 2 angka : " + kurang);
        System.out.println("Perkalian 2 angka : " + kali);
        System.out.println("Pembagian 2 angka : " + bagi);
    }
}
