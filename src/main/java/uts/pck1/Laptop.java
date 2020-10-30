//Laptop.java
package uts.pck1;
public class Laptop{
	//atribut
	/*deklarasikan atribut di sini*/
	
	
	//konstruktor
	//konstruktor
	/*tulis konstruktor tanpa parameter di sini*/
	
	
	/*tulis konstruktor dengan  parameter di sini*/
	
	
	/*tulis kopi konstruktor di sini*/
	
	//setter
	/*tulis semua setter di sini*/
	
	
	
	
	//getter
	/*tulis semua getter di sini*/
	
	
	
	/*tulis method menjalankanAplikasi() di sini*/
	/*Method menjalankanAplikasi() akan mengembalikan sebuah string, baca file Readme.md*/
	
	
	
	/*tulis method toString() di sini*/
	/*Method toString() akan mengembalikan sebuah string, baca file Readme.md*/
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof Laptop){
			Laptop lt = (Laptop) o;
			return (getJenis().equalsIgnoreCase(lt.getJenis()) && getUkuranLayar()== lt.getUkuranLayar() && getProsesor().equals(lt.getProsesor()) && getRam()==lt.getRam() &&getHarddisk()==lt.getHarddisk());
		}
		return false;
	}
}