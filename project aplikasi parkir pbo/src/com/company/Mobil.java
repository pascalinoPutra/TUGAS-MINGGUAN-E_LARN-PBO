package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mobil extends Kendaraan {
	private String plat;
	private int jamMasuk;
	private int menitMasuk;
	private int inEntry;
	private boolean kendaraanIn;

	Scanner in = new Scanner(System.in);
//	PetugasParkir parkir=new PetugasParkir();

	public Mobil() {
		this.kendaraanIn = false;
		this.inEntry=0;
	}

	public int getInEntry() {
		return inEntry;
	}

	public void setInEntry(int inEntry) {
		this.inEntry = inEntry;
	}

	public boolean isKendaraanIn() {
		return kendaraanIn;
	}

	public void setKendaraanIn(boolean kendaraanIn) {
		this.kendaraanIn = kendaraanIn;
	}

	@Override
	public void kendaraanMasuk() {
		kendaraanIn=true;
		System.out.print("plat nomer mobil : ");
		plat=in.nextLine();
		setPlatNomer(plat);

		System.out.println("waktu masuk : ");
		System.out.print("\tJam = ");
		jamMasuk=in.nextInt();
		setJamMasuk(jamMasuk);

		System.out.print("\tmenit = ");
		menitMasuk=in.nextInt();
		setMenitMasuk(menitMasuk);
		System.out.println("-------------------------------------------");


//		parkir.entrySub();

	}

	@Override
	public void cetakKarcis() {
		java.io.File file=new java.io.File("karcis.txt");
		try {
			java.io.PrintWriter output= new java.io.PrintWriter(file);
			output.print("----------------------------------------");
			output.print("\n==== selamat datang di parkiran UAD ====");
			output.print("\n====      Karcis Masuk Mobil        ===");
			output.print("\n----------------------------------------");
			output.print("\n\n\ttarif mobil  : 3000/jam (max 100.000) ");
			output.print("\n\tPlat no mobil : " + getPlatNomer());
			output.print("\n\twaktu masuk   : " +getJamMasuk()+ "."+getMenitMasuk());
			output.print("\n\n----------------------------------------");
			output.print("\n== jaga struk ini jangan sampai hilang==");
			output.print("\n----------------------------------------");
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
