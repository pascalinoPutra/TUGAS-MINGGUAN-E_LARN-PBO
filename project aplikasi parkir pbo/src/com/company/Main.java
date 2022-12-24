package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilih;
        String pilihan;

        Mobil mbl = new Mobil();
        Motor mtr =  new Motor();
        LahanParkir lhn=new LahanParkir(true);

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===========================================");
            System.out.println("===== SELAMAT DATANG DI PARKIRAN UAD =====");
            System.out.println("===========================================");
            System.out.println("[1] Mobil");
            System.out.println("[2] Motor");
            System.out.println("[0] cancel");
            System.out.print("masukan jenis kendaraaan : ");
            pilih = input.nextInt();
            System.out.println("-------------------------------------------");
            if(pilih==1){
                System.out.println("============ parkiran mobil UAD ===========");
                mbl.kendaraanMasuk();
                mbl.cetakKarcis();
                lhn.entrySum();
                mbl.exit_parkir();
                }
            else if (pilih==2){
                System.out.println("============ parkiran motor UAD ===========");
                mtr.kendaraanMasuk();
                mtr.cetakKarcis();
                mtr.exit_parkir();
            }
            else if(pilih==0){
                System.exit(0);
            }
            else
            {
                System.out.println("inputan yang anda masukan salah");
            }
        }

    }
}
