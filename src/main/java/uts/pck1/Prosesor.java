//Prosesor.java
package uts.pck1;
public class Prosesor{
	//atribut
	/*deklarasikan atribut di sini*/
	
	//konstruktor
	/*tulis konstruktor tanpa parameter di sini*/
	
	
	/*tulis konstruktor dengan  parameter di sini*/
	
	
	/*tulis kopi konstruktor di sini*/
	
	//setter
	/*tulis semua setter di sini*/
	
	
	
	
	//getter
	/*tulis semua getter di sini*/
	
	
	
	/*tulis method toString() di sini*/
	/*Method toString() akan mengembalikan sebuah string, baca file Readme.md*/
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof Prosesor){
			Prosesor p = (Prosesor) o;
			return (getJenis().equalsIgnoreCase(p.getJenis()) && getJmlInti()== p.getJmlInti());
		}
		return false;
	}
}
