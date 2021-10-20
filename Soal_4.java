import java.util.Scanner;
class Soal_4 { 
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[]args){
        int bilangan;

        System.out.print("Masukkan bilangan = ");
        bilangan = input.nextInt();

        if(bilangan % 2 == 0 && bilangan % 5 == 0){
            System.out.println("Bilangan kelipatan 2 dan 5");
        }else if(bilangan % 2 == 0){
            System.out.println("Bilangan kelipatan 2");
        }else if(bilangan % 5 == 0){
            System.out.println("Bilangan kelipatan 5");
        }else{
            System.out.println("Bilangan bukan kelipatan 2 dan 5");
        }
    }
}