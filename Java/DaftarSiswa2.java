import java.util.ArrayList;
import java.util.Scanner;

class Siswa {
    String nip;
    String nama;
    String lahirTanggal;
    String lahirTempat;

    public Siswa(String nip, String nama, String lahirTanggal, String lahirTempat) {
        this.nip = nip;
        this.nama = nama;
        this.lahirTanggal = lahirTanggal;
        this.lahirTempat = lahirTempat;
    }

    public void tampilData() {
        System.out.println("NIP            : " + nip);
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Lahir  : " + lahirTanggal);
        System.out.println("Tempat Lahir   : " + lahirTempat);
        System.out.println("--------------------------------");
    }
}

public class DaftarSiswa2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Siswa> daftarSiswa = new ArrayList<>();

        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Siswa ke-" + (i + 1));

            System.out.print("Masukkan NIP           : ");
            String nip = input.nextLine();

            System.out.print("Masukkan Nama          : ");
            String nama = input.nextLine();

            System.out.print("Masukkan Tanggal Lahir : ");
            String tanggal = input.nextLine();

            System.out.print("Masukkan Tempat Lahir  : ");
            String tempat = input.nextLine();

            daftarSiswa.add(new Siswa(nip, nama, tanggal, tempat));
        }

        System.out.println("\n===== DAFTAR SISWA =====");
        for (Siswa s : daftarSiswa) {
            s.tampilData();
        }

        input.close();
    }
}
