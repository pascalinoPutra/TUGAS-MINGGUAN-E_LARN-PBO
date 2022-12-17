package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Motor extends Kendaraan{

	private String plat;
	private int jamMasuk;
	private int menitMasuk;
	private boolean kendaraanIn=false;
	Scanner in = new Scanner(System.in);

	@Override
	public void kendaraanMasuk() {
		kendaraanIn=true;
		System.out.print("Masukan nomer plat motor : ");
		plat=in.nextLine();
		setPlatNomer(plat);

		System.out.print("Jam masuk : ");
		jamMasuk=in.nextInt();
		setJamMasuk(jamMasuk);

		System.out.print("\tmenit = ");
		menitMasuk=in.nextInt();
		setMenitMasuk(menitMasuk);
		System.out.println("-------------------------------------------");
	}

	@Override
	public void cetakKarcis() {
		java.io.File file=new java.io.File("karcis.txt");
		try {
			java.io.PrintWriter output= new java.io.PrintWriter(file);
			output.print("----------------------------------------");
			output.print("\n==== selamat datang di parkiran UAD ====");
			output.print("\n====      Karcis Masuk Motor        ===");
			output.print("\n----------------------------------------");
			output.print("\n\n\ttarif motor  : 2000 (flat) ");
			output.print("\n\tPlat no motor : " + getPlatNomer());
			output.print("\n\twaktu masuk   : " +getJamMasuk()+ "."+getMenitMasuk());
			output.print("\n\n-----------------------------------------");
			output.print("\n== jaga struk ini jangan sampai hilang ==");
			output.print("\n-----------------------------------------");
			output.close();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}

	@Override
	public void hargaParkir() {

	}

	@Override
	public void entrySub() {

	}

	@Override
	public void entrySum() {

	}
}
