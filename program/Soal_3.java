/*
program menghitung total gaji karyawan berdasarkan masa kerja 
*/
import java.util.Scanner;
class Soal_3 { 
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[]args){
        int masaKerja,gajiPokok;
        double totalGaji;

        System.out.print("Masukkan masa kerja anda : ");
        masaKerja = input.nextInt();

        System.out.print("Masukkan gaji pokok anda : ");
        gajiPokok = input.nextInt();

        if(masaKerja > 3){
            totalGaji = 0.2 * gajiPokok;
        }else{
            totalGaji = 0.1 * gajiPokok;
        }

        System.out.println("Total gaji anda = "+totalGaji);
    }
}