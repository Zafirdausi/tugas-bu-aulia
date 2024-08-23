import java.util.Scanner;

public class Diskon {
    
    public static void main(String[] args) {

        //start

        System.out.println("kalkulatorDiskon");
        System.out.println("===========================================");

        //input harga

        System.out.println("masukkan harga awal barang. (angka saja)");
        double harga = new Scanner (System.in).nextDouble();
        System.out.println("===========================================");

        //input diskon

        System.out.println("masukandiskonbarang. (angka saja)");
        double diskon = new Scanner(System.in).nextInt();
        diskon /=100;
        System.out.println("===========================================");

        //input jumlah 

        System.out.println("masukkan jumlah barang yang dibeli. (angka saja)");
        int jumlah = new Scanner(System.in).nextInt();
        System.out.println("=============================================");

        // equation

        double totalHarga = (harga - (harga*diskon)) *jumlah; 

        // output

        System.out.println("mohon tunggu hasil dari nilai yang anda masukkan.");
        System.out.println("total harga dari belanja anda adalah Rp"+".");
        System.out.println("===============================================");
        System.out.println("sekian,terimakasih");
        System.out.println("Code written by Zafir");
        


        
    }

    
}
