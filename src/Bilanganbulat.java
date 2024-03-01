import java.util.Scanner;

public class Bilanganbulat {
    // bilangan habis dibagi 3
    public static boolean Mod3(int bilangan) {
        return bilangan % 3 == 0;
    }

    // bilangan tidak habis dibagi 2
    public static boolean Tidakmod2(int bilangan) {
        return bilangan % 2 != 0;
    }

    public static void main (String[] args) {
        // menginput bilangan bulat positif n
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai dari n : ");
        int n = scan.nextInt();
        // menampilkan n bilangan bulat positif pertama yang habis dibagi 3 dan tidak habis dibagi 2
        System.out.println("Bilangan yang habis dibagi 3 tapi tidak habis dibagi 2");
        int i = 0;
        int bilangan = 1;
        while (i < n) {
            if (Mod3(bilangan) && Tidakmod2(bilangan)) {
                System.out.print(bilangan + " ");
                i++; // i = i + 1 untuk mencegah infinite loop
            }
            bilangan++;
        }
    }
}
