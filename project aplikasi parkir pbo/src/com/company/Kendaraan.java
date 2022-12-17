package com.company;

 public abstract class Kendaraan implements Parking,Petugas {
	private String platNomer;
	private int jamMasuk;
	private int menitMasuk;

	 public Kendaraan() {
	 }
	 public String getPlatNomer() {
		return platNomer;
	}
	public void setPlatNomer(String pn) {
		this.platNomer = pn;
	}
	public int getJamMasuk() {
		return jamMasuk;
	}
	public void setJamMasuk(int jamMasuk) {
		this.jamMasuk = jamMasuk;
	}

	 public int getMenitMasuk() {
		 return menitMasuk;
	 }

	 public void setMenitMasuk(int menitMasuk) {
		 this.menitMasuk = menitMasuk;
	 }
	 abstract public void kendaraanMasuk();
	 abstract public void cetakKarcis();
 }
