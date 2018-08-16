package job11;
import java.util.Locale;
public class cobaOperasiiString {
    public static void main(String[] args) {
    String identitas = "Taufiqy Firdaus Jatu/ XRPL2/ 36";
    System.out.println("identitas : "+ identitas);
    
    String x = "Operasi";
    
    System.out.println("isi variable x : "+ x);
    System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
    System.out.println("x adalah kosong : " + x.isEmpty());
        
    String y = "";
    System.out.println("isi variable y : "+ y);
    System.out.println("y adalah kosong : "+ y.isEmpty());
    
    
    System.out.println("Isi x sama dengan y : "+ x.equals(y));
        
    String z = "Operasi";
    System.out.println("Isi variabel z : "+ z);
    System.out.println("Isi x sama dengan z (Case Sensitive): "+ x.equals(z));
        
    String r = "operasi";
    System.out.println("Isi variabel r : "+ r);
    System.out.println("Isi x sama dengan r (Case Sensitive): "+ x.equals(r));
    System.out.println("Isi x sama dengan r (Not Case Sensitive): "+ x.equalsIgnoreCase(r));
        
    
        
}
    
}
