import java.util.Scanner;

public class Segitiga {
    public static void main (String[] args) {
        System.out.println("Masukkan tinggi : ");
        Scanner input = new Scanner(System.in);
        int tinggi = input.nextInt();

        //Looping untuk baris
        for (int i = 1; i <= tinggi; i++) {

            //Looping untuk kolom
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
