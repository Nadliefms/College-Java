import java.util.Scanner;

public class Pos1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan qty: ");
        int qty = input.nextInt();

        System.out.print("Masukkan harga: ");
        int harga = input.nextInt();

        int total = qty * harga;

        
        if (qty > 10) {
            double diskon = total * 0.05;
            total -= diskon;
            System.out.println("Dapat diskon 5%");
        }

        System.out.println("Total bayar: " + total);
    }
}
