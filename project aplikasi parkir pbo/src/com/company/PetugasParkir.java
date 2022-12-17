package com.company;

public class PetugasParkir extends Mobil  {
	private int capasity;
	private boolean kendaraanIn;

	public PetugasParkir(){
		this.kendaraanIn =false;
		this.capasity=0;
	}

	public int getCapasity() {
		return capasity;
	}

	public void setCapasity(int capasity) {
		this.capasity = capasity;
	}

	@Override
	public void kendaraanMasuk() {
	}

	@Override
	public void cetakKarcis() {

	}

	@Override
	public void hargaParkir() {

	}

	@Override
	public void entrySub() {
		if (isKendaraanIn()==true)
		{
			if (this.capasity==MAX_CAPASITY){
				System.out.println("Parkiran penuh sudah mencapai batas ( "+this.getCapasity()+"% )");
			}
			else{
				this.capasity+=1;
				System.out.println("jumlah parkir yang tersedia : "+this.getCapasity());
			}
		}

	}

	@Override
	public void entrySum() {

	}
}
