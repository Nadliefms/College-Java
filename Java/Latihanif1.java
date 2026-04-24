import java.util.Scanner;

public class Latihanif1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String jawab1, jawab2;

        
        System.out.print("Apakah kamu suka matematika? (ya/tidak): ");
        jawab1 = input.nextLine();

        if (jawab1.equalsIgnoreCase("ya")) {
            
            System.out.print("Apakah kamu suka komputer? (ya/tidak): ");
            jawab2 = input.nextLine();

            if (jawab2.equalsIgnoreCase("ya")) {
                System.out.println("Jurusan yang cocok: Teknik Informatika");
            } else {
                System.out.println("Jurusan yang cocok: Pendidikan Matematika");
            }

        } else {
            
            System.out.print("Apakah kamu suka ekonomi? (ya/tidak): ");
            jawab2 = input.nextLine();

            if (jawab2.equalsIgnoreCase("ya")) {
                System.out.println("Jurusan yang cocok: Ilmu Ekonomi");
            } else {
                System.out.println("Jurusan yang cocok: Sastra");
            }
        }

        input.close();
    }
}