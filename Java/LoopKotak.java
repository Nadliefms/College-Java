import java.util.Scanner;

public class LoopKotak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("panjang? ");
        int panjang = input.nextInt();
        
        System.out.print("lebar? ");
        int lebar = input.nextInt();
        
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        
        input.close();
    }
}