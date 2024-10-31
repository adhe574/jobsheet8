import java.util.Scanner;

public class tugasPersegi01 {
    public static void main(String[] args) {        
        Scanner sc01 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc01.nextInt();
        int i = 0;

        if (N < 3) {
            System.out.println("Masukkan nilai N (minimal 3): ");
        } else {
            for (i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    if (i==0 || i==N-1 || j==0 ||j==N-1) {
                        System.out.print("5");
                    } else {
                        System.out.print("3");
                    }
                }
                System.out.println();
            }
        }
    }
}
