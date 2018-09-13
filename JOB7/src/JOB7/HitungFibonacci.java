package JOB7;
import java.util.Scanner;
public class HitungFibonacci {
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    private static int tampilInput() {
        Scanner sistem = new Scanner(System.in);
        
        System.out.print("Bilangan ke-: ");
        int n = sistem.nextInt();
        
        return n;
    }
    
}
