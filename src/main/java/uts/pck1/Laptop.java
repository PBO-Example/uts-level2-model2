//Laptop.java
package uts.pck1;
public class Laptop{
	//atribut
	private String jenis;
	private int ukuranLayar;
	private Prosesor prosesor;
	private double ram;
	private double harddisk;
	
	//konstruktor
	public Laptop(){
		jenis ="laptop asus";
		ukuranLayar=14;
		prosesor=new Prosesor();
		ram=4.00;
		harddisk=1024.00;
	}
	public Laptop(String jenis, int ukuranLayar,Prosesor prosesor,double ram,double harddisk){
		this.jenis =jenis;
		this.ukuranLayar=ukuranLayar;
		this.prosesor=new Prosesor(prosesor);
		this.ram=ram;
		this.harddisk=harddisk;
	}
	public Laptop(Laptop K){
		jenis = K.jenis;
		ukuranLayar=K.ukuranLayar;
		prosesor=new Prosesor(K.prosesor);
		ram=K.ram;
		harddisk=K.harddisk;
	}
	
	//setter
	public void setJenis(String jenis){
		this.jenis =jenis;
	}
	public void setUkuranLayar(int ukuranLayar){
		this.ukuranLayar=ukuranLayar;
	}
	public void setProsesor(Prosesor prosesor){
		this.prosesor=prosesor;
	}
	public void setRam(double ram){
		this.ram=ram;
	}
	public void setHarddisk(double harddisk){
		this.harddisk=harddisk;
	}
	//getter
	public String getJenis( ){
		return jenis;
	}
	public int getUkuranLayar( ){
		return ukuranLayar;
	}
	public Prosesor getProsesor( ){
		return prosesor;
	}
	public double getRam(){
		return ram;
	}
	public double getHarddisk( ){
		return harddisk;
	}
	public String menjalankanAplikasi(String namaAplikasi, double ram, double harddisk){
		if (((this.ram-ram) >=0) && ((this.harddisk-harddisk) >=0)){
			this.ram-=ram;
			this.harddisk-=harddisk;
			return ("\nLaptop sedang menjalankan aplikasi "+namaAplikasi+ " sisa ram:"+this.ram+" GB, sisa harddisk:"+this.harddisk+" GB");
		}else{
			return ("\nSpesifikasi Laptop tidak sanggup menjalankan aplikasi "+namaAplikasi);
		}
	}
	
	public String toString(){
		return "Spesifikasi "+jenis+":"+"ukuran layar "+ukuranLayar+", prosesor "+prosesor+", RAM "+ram+" GB, harddisk "+harddisk+" GB";
	}
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof Laptop){
			Laptop lt = (Laptop) o;
			return (getJenis().equalsIgnoreCase(lt.getJenis()) && getUkuranLayar()== lt.getUkuranLayar() && getProsesor().equals(lt.getProsesor()) && getRam()==lt.getRam() &&getHarddisk()==lt.getHarddisk());
		}
		return false;
	}
}