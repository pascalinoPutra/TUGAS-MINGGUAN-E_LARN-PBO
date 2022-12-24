package com.company;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Mobil extends Kendaraan {

	private String plat;
	private int jam3, menit3, detik3;
	private boolean kendaraanIn;
	private int jam,menit,jamKeluar,menitKeluar;
	private int hari,bulan,tahun;
	private int sisa, durasi, total1, total2,totalBayar;
	private String [] namaBulan={"Januari","Februari","Maret","April","Mei","juni","Juli","Agustus","September","Oktober","November","Desember"};
	Scanner in = new Scanner(System.in);

	public Mobil() {
		this.kendaraanIn = false;
	}

	public int getTotalBayar() {
		return totalBayar;
	}

	public void setTotalBayar(int totalBayar) {
		this.totalBayar = totalBayar;
	}

	public int getJam3() {
		return jam3;
	}

	public void setJam3(int jam3) {
		this.jam3 = jam3;
	}

	public int getMenit3() {
		return menit3;
	}

	public void setMenit3(int menit3) {
		this.menit3 = menit3;
	}

	public int getDetik3() {
		return detik3;
	}

	public void setDetik3(int detik3) {
		this.detik3 = detik3;
	}

	public int getSisa() {
		return sisa;
	}

	public void setSisa(int sisa) {
		this.sisa = sisa;
	}

	public int getDurasi() {
		return durasi;
	}

	public void setDurasi(int durasi) {
		this.durasi = durasi;
	}

	public int getTotal1() {
		return total1;
	}

	public void setTotal1(int total1) {
		this.total1 = total1;
	}

	public int getTotal2() {
		return total2;
	}

	public void setTotal2(int total2) {
		this.total2 = total2;
	}

	public boolean isKendaraanIn() {
		return kendaraanIn;
	}

	public void setKendaraanIn(boolean kendaraanIn) {
		this.kendaraanIn = kendaraanIn;
	}

	@Override
	public void kendaraanMasuk() {
		GregorianCalendar date = new GregorianCalendar();

		jam=date.get(Calendar.HOUR_OF_DAY);
		menit=date.get(Calendar.MINUTE);

		hari=date.get(Calendar.DAY_OF_MONTH);
		bulan=date.get(Calendar.MONTH);
		tahun=date.get(Calendar.YEAR);

		System.out.print("\nplat nomer mobil = ");
		plat=in.nextLine();
		setPlatNomer(plat);
		System.out.println("waktu masuk = "+hari+"/"+bulan+"/"+tahun+"" + " "+jam+":"+menit);
		setTglMasuk(hari);
		setBlnMasuk(bulan);
		setTahunMasuk(tahun);
		setJamMasuk(jam);
		setMenitMasuk(menit);
		System.out.println("\n-------------------------------------------");
	}

	@Override
	public void cetakKarcis() {
		java.io.File file=new java.io.File("karcis.txt");
		try {
			java.io.PrintWriter out= new java.io.PrintWriter(file);
			out.print("----------------------------------------");
			out.print("\n\n==== selamat datang di parkiran UAD ====");
			out.print("\n====      Karcis Masuk Mobil        ===");
			out.print("\n----------------------------------------");
			out.print("\n\n\ttarif mobil   = "+MOBIL_PRICE+"/Jam");
			out.print("\n\tPlat no mobil = " + getPlatNomer());
			out.print("\n\twaktu masuk   = " +getTglMasuk()+"/"+getBlnMasuk()+"/"+getTahunMasuk()+" "+getJamMasuk()+ ":"+getMenitMasuk());
			out.print("\n\n----------------------------------------");
			out.print("\n== jaga struk ini jangan sampai hilang==");
			out.print("\n----------------------------------------");
			out.close();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}

	@Override
	public void totalHarga() {
		total1=(getJamMasuk()*3600)+(getMenitMasuk()*60);
		setTotal1(total1);
		total2=(getJamKeluar()*3600)+(getMenitKeluar()*60);
		setTotal2(total2);

		durasi=getTotal2()-getTotal1();
		setDurasi(durasi);

		jam3 = getDurasi()/3600;
		setJam3(jam3);
		sisa = getDurasi()%3600;
		setSisa(sisa);
		menit3 = getSisa()/60;
		setMenit3(menit3);
		System.out.println("\tlama parkir   = "+jam3+" jam, "+menit3+" menit");

			if (getJam3()==1){
				totalBayar= getJam3()*MOBIL_PRICE;
			}
			else if (getJam3()==2){
				totalBayar=getJam3()*MOBIL_PRICE;
			}
			else if (getJam3()==3){
				totalBayar=getJam3()*MOBIL_PRICE;
			}
			else if (getJam3()==4){
				totalBayar=getJam3()*MOBIL_PRICE;
			}
			else if (getJam3()==5){
				totalBayar=getJam3()*MOBIL_PRICE;
			}
			else if (getJam3()==6){
				totalBayar=getJam3()*MOBIL_PRICE;
			}
			else if (getJam3()==7){
				totalBayar=getJam3()*MOBIL_PRICE;
			}else if (getJam3()==8){
				totalBayar=getJam3()*MOBIL_PRICE;
			}else if (getJam3()==9){
				totalBayar=getJam3()*MOBIL_PRICE;
			}else if (getJam3()==10){
				totalBayar=getJam3()*MOBIL_PRICE;
			}
			else{
				totalBayar=MAX_PARKING;
			}


	}

	@Override
	public final void exit_parkir() {

		System.out.print("\n=======================================");
		System.out.print("\n====      Keluar parkir Mobil      ====");
		System.out.print("\n----------------------------------------");
		System.out.print("\n\n\ttarif mobil   = "+MOBIL_PRICE+"/Jam");
		System.out.print("\n\tPlat no mobil = " + getPlatNomer());
		System.out.print("\n\twaktu masuk   = " +getTglMasuk()+"/"+getBlnMasuk()+"/"+getTahunMasuk()+" "+getJamMasuk()+ ":"+getMenitMasuk());
		System.out.print("\n\twaktu keluar ");
		System.out.print("\n\t\tjam keluar   = ");
		jamKeluar=in.nextInt();
		setJamKeluar(jamKeluar);
		System.out.print("\t\tmenit keluar = ");
		menitKeluar=in.nextInt();
		setMenitKeluar(menitKeluar);
		totalHarga();
		System.out.print("\tTotal bayar  = "+getTotalBayar());
		System.out.println("\n----------------------------------------");

//		PRINT STRUK PARKIR
		java.io.File file2 =new java.io.File("struk.txt");
		try {
			GregorianCalendar date = new GregorianCalendar();
			java.io.PrintWriter out = new java.io.PrintWriter(file2);

			jam=date.get(Calendar.HOUR_OF_DAY);
			menit=date.get(Calendar.MINUTE);

			hari=date.get(Calendar.DAY_OF_MONTH);
			bulan=date.get(Calendar.MONTH);
			tahun=date.get(Calendar.YEAR);

			out.print("\n-----------------------------------------");
			out.print("\n========      sistem parkir UAD    =======");
			out.print("\n========      bukti pembayaran     ======");
			out.print("\n----------------------------------------");

			out.print("\n\n\ttarif mobil   = "+MOBIL_PRICE+"/Jam");
			out.print("\n\tPlat no mobil = " + getPlatNomer());
			out.print("\n\twaktu masuk   = " +getTglMasuk()+"/"+getBlnMasuk()+"/"+getTahunMasuk()+" "+getJamMasuk()+ "."+getMenitMasuk());
			out.print("\n\twaktu Keluar  = "+getJamKeluar()+":"+getMenitKeluar());
			out.print("\n\ttotal waktu   = "+getJam3()+" jam, "+getMenit3()+" menit");
			out.print("\n\ttotal bayar   = "+"Rp."+getTotalBayar());
			out.print("\n\n-----------------------------------------");
			out.print("\n====   TERIMA KASIH -  SELAMAT JALAN   ====");
			out.print("\n-------------------------------------------");
			out.close();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}

	}
}
