package JOB7;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        String identitas = "Taufiqy Firdaus Jatu / XRPL2 / 36";
        System.out.println(identitas);
        int [] nominal =  {3000, 2000, 500, 200, 100};
        Scanner sistem = new Scanner(System.in);
        System.out.print("Masukkan nominal : ");
        int uang = sistem.nextInt();
        
        
        for (int i=0;i<5;i++){
            int jumlah = uang/nominal[i];
            uang = uang - (nominal[i]*jumlah);
            
            System.out.println("Lembar"+ nominal[i]+ "=" +jumlah);
        }
    }
}
