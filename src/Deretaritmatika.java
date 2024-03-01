import java.util.Scanner;
public class Deretaritmatika {
    // Menjumlah angka
    public static int deretmatematika(int n) {
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i; // jumlah = jumlah + 1
        }
        return jumlah;
    }

    public static void main (String[] args) {
        // Menginput nilai n
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scan.nextInt();

        // Jumlah dari deret
        int hasil = deretmatematika(n);

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan deret aritmatika 1 + 2 + ... + " + n + " adalah " + hasil);
    }
}
