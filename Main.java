package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int jmlhTilangan;
        Scanner scan=new Scanner(System.in);
        int x =0;
        do {
            System.out.print("-");
            x++;
        }
        while(x <=46);
        System.out.println("\n+        data motor tilangan kepolisian       +");
        System.out.println("-----------------------------------------------");
        System.out.print("jumlah tilangan : ");
        jmlhTilangan =scan.nextInt();

        String data[][]=new String[jmlhTilangan][3];
        System.out.println("program data motor tilangan kepolisian ");
        for (int g = 0; g < jmlhTilangan; g++)
        {
            System.out.println("");
            System.out.println("data tilangan -"+(g +1));
            for (int h = 0; h <3; h++)
            {
                if (h ==0)
                {
                    System.out.print("tipe kendaraan : ");
                }
                else if(h ==1)
                {
                    System.out.print("nomer kendaraan : ");
                }
                else
                {
                    System.out.print("pasal yang dilanggar : ");
                }
                data[g][h]=scan.next();
            }
        }


        System.out.println("----------------------");
        System.out.println("\noutput program data dealer mobil ");
        System.out.println("----------------------");

        for(int a = 0; a< jmlhTilangan; a++)
        {
            System.out.println("data hasil tilangan ke-"+(a+1));
            for (int b=0; b<3;b++)
            {
                System.out.print(data[a][b]+"\n");
            }
            System.out.println();
            System.out.println("----------------------");
        }
//        nama: attiya elvita putri
//        NIM : 21000184
//        KELAS : J
    }
}
