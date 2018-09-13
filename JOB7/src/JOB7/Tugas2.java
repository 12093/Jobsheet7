package JOB7;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        String identitas = "Taufiqy Firdaus Jatu / XRPL2 / 36";
        System.out.println(identitas);
        Scanner sistem = new Scanner(System.in);
        int arr[]= {7, 5, 4, 3, 2};
        int arr1[]= {10000, 7000, 5000, 3000, 2000};
        int gaji = 0;
        
        System.out.print("Jumlah berat maksimal : ");
        int n = sistem.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            int hasil =  n / arr[i];
            n = n - (arr[i] * hasil);
            gaji += hasil * arr1[i];
        }
        System.out.println("Bayaran yang didapat : " + gaji);
    }
}
