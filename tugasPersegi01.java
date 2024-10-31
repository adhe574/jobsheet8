import java.util.Scanner;

public class tugasPersegi01 {
    public static void main(String[] args) {        
        Scanner sc01 = new Scanner(System.in);

        int N, i, j;

        do { 
            System.out.print("Masukkan nilai N (minimal 3): ");
            N = sc01.nextInt();
        
            if (N < 3) {
                System.out.println("nilai N harus minimal 3. Masukkan nilai N yang benar!");
            }

            } while (N < 3);

            for (i = 0; i < N; i++) {
                for (j = 0; j < N; j++) {
                    if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }
}