import java.util.Scanner;

public class RataNilai01 {
   public static void main(String[] args) {       
    Scanner sc01 = new Scanner(System.in);
    int i, j, nilaiMahasiswa;
    float totalNilai, rataNilai;

    i=1;
    while (i<=5) {
        totalNilai=0;
        System.out.println("Input Nilai Mahasiswa ke " + i);
 
    for (j=1;j<=5;j++) {
        System.out.print("Nilai ke " + j + " = ") ;
        nilaiMahasiswa=sc01.nextInt();
        totalNilai += nilaiMahasiswa;
           
    }
        rataNilai=totalNilai/5;
        System.out.println("Rata-rata Nilai Mahasiswa ke " + i +" adalah " + rataNilai);
        System.out.println();
        i++;
    }
   } 
}
