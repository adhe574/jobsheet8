import java.util.Scanner;
public class Porseni01 {
    public static void main(String[] args) {
        
        Scanner sc01 = new Scanner(System.in);

        int jumlahPoliteknik, i, k;
        String namaPoliteknik, dataAtlet, namaAtlet;

        System.out.print("Masukkan Jumlah Politeknik yang Mendafar: ");
        jumlahPoliteknik = sc01.nextInt();
        sc01.nextLine();

        String[] cabangOlahraga = { "Badminton", "Tenis Meja", "Basket", "Bola Voli" };
        dataAtlet = "";

        for (i=1; i<=jumlahPoliteknik; i++) {
             System.out.print("Masukkan Nama Politeknik ke- " + i + " : " );
             namaPoliteknik = sc01.nextLine();
             dataAtlet += "Politeknik" + i + " (" + namaPoliteknik + "):\n";

             for (String cabang : cabangOlahraga) {
                dataAtlet += "Cabang" + cabang + ":\n";

                for (k=1; k<=5; k++) {
                    System.out.print("Masukkan nama atlet ke- " + k + " untuk cabang " + cabang + " : ");
                    namaAtlet = sc01.nextLine();
                    dataAtlet += "Atlet" + k + " : " + namaAtlet + "\n";
                }
             }
            dataAtlet += "\n";

        System.out.println("Nama Atlet Porseni 2024");
        System.out.println(dataAtlet);
        }  
        sc01.close();
    }
}