
public class Main {
	public static void main(String[] args) {
		//GENERİC CLASS , METHOD İN JAVA
		
		//<>  ----> generic
		
		VeriTabani<Ogrenci> veriTabani = new VeriTabani<Ogrenci>();
	    veriTabani.kaydet(new Musteri(1,"faik","aktas")); 
		
	}
}
