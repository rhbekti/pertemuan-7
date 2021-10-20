import java.util.Scanner;
class Soal_1 { 
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[]args){
        int bil1,bil2,bil3,bil4,bil5,jumlah;
        double rata_rata;

        System.out.print("masukkan bilangan 1 = ");
        bil1 = input.nextInt();
        System.out.print("masukkan bilangan 2 = ");
        bil2 = input.nextInt();
        System.out.print("masukkan bilangan 3 = ");
        bil3 = input.nextInt();
        System.out.print("masukkan bilangan 4 = ");
        bil4 = input.nextInt();
        System.out.print("masukkan bilangan 5 = ");
        bil5 = input.nextInt();

        jumlah = bil1 + bil2 + bil3 + bil4 + bil5;

        rata_rata = jumlah/5;

        System.out.println("Jumlah = "+jumlah);
        System.out.println("Rata-Rata = "+rata_rata);

    }
}

