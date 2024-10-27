import java.util.Scanner;

public class RataNilai01 {
   public static void main(String[] args) {       
    Scanner sc01 = new Scanner(System.in);
    int i,j;
    float nilai, totalNilai = 0, rataNilai;

    for (j=1;j<=5;i++); {
        totalNilai=0;
        System.out.println("Input Nilai Mahasiswa ke " + i);

        for (j=1;j<=5;j++);
            System.out.print("Nilai ke-" +j + " = ");
            nilai=sc01.nextInt();
            totalNilai+=nilai;
            rataNilai=totalNilai/5;
    }
    i=1;
    while (i<=5) {
        totalNilai=0;
        for (j=1;j<=5;j++) {
            System.out.print("Nilai ke-" +j + " = ");
            nilai=sc01.nextInt();
            totalNilai+=nilai;
        }
        rataNilai=totalNilai/5;
        i++;
    }
    
   } 
}
