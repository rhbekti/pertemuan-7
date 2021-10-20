import java.util.Scanner;
class Soal_2 { 
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[]args){
        double celcius,kelvin;

        System.out.print("Masukkan suhu celcius = ");
        celcius = input.nextDouble();

        kelvin = celcius + 273.15;

        System.out.println("Suhu dalam kelvin = "+kelvin);
    }
}