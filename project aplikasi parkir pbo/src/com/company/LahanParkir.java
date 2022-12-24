package com.company;

public class LahanParkir implements Parking {
	private boolean kendaraanIn;
	private int jmlhKendaraanMasuk;
	private int sisaLahan;

	public LahanParkir(boolean kendaraanIN) {
		this.kendaraanIn = kendaraanIN;
	}

	public void setKendaraanIn(boolean kendaraanIn) {
		this.kendaraanIn = kendaraanIn;
	}

	public int getJmlhKendaraanMasuk() {
		return jmlhKendaraanMasuk;
	}

	public void setJmlhKendaraanMasuk() {
		this.jmlhKendaraanMasuk +=1;
	}

	public void setSisaLahan() {
		this.sisaLahan = MAX_PARKING-getJmlhKendaraanMasuk();
	}

	public int getSisaLahan() {
		return sisaLahan;
	}

	@Override
	public void entrySum() {
		if (kendaraanIn ==true){

			if (jmlhKendaraanMasuk<=MAX_PARKING){
				setJmlhKendaraanMasuk();
				System.out.println("jumlah kendaraan: "+getJmlhKendaraanMasuk());
				setSisaLahan();
				System.out.println("parkir tersedia : "+getSisaLahan());
			}
			else if (getJmlhKendaraanMasuk()==MAX_PARKING){
				System.out.println("parkiran penuh !!!!");
			}
		}
		else{
			System.out.println("belum ada sama sekali kendaraan yang masuk");
		}

	}

}
