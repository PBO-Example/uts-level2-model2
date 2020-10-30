//Prosesor.java
package uts.pck1;
public class Prosesor{
	//atribut
	private String jenis;
	private int jmlInti;
	
	//konstruktor
	public Prosesor(){
		jenis = "Intel Core i5-5820K";
		jmlInti = 4;
	}
	public Prosesor(String jenis, int jmlInti){
		this.jenis = jenis;
		this.jmlInti = jmlInti;
	}
	public Prosesor(Prosesor p){
		jenis = p.jenis;
		jmlInti = p.jmlInti;
	}
	
	//setter
	public void setJenis(String jenis){
		this.jenis = jenis;
	}
	public void setJmlInti(int jmlInti){
		this.jmlInti = jmlInti;
	}
	
	//getter
	public String getJenis(){
		return jenis;
	}
	public int getJmlInti(){
		return jmlInti;
	}
	public String toString(){
		return jenis+" "+jmlInti+" inti";
	}
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object o){
		if (o instanceof Prosesor){
			Prosesor p = (Prosesor) o;
			return (getJenis().equalsIgnoreCase(p.getJenis()) && getJmlInti()== p.getJmlInti());
		}
		return false;
	}
}
