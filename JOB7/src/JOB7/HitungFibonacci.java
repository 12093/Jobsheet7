package JOB7;
import java.math.BigInteger;
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
    private static BigInteger figo(int n) {
        
        BigInteger[] hasil = new BigInteger[n];
        
        hasil[0] = BigInteger.ONE;
        hasil[1] = BigInteger.ONE;
        
        for (int i = 2; i < n; i++) {
            hasil[i] = hasil[i-1].add(hasil[i-2]);
        }
        
        return hasil[n-1];
    }
    private static void tampilHasil(int n, BigInteger hasil) {
        System.out.println("Bilangan Fibonacci ke-"+n+" : " + hasil);
    }
    
}
