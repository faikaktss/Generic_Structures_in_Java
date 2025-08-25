package GenericMethod;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		//GENERİC METOHD
		
		Integer[] intDizi = {1,2,3,4,5,6,7,8};
		
		String[] stringDizi = {"Enes","Ahmet","Mehmet","Faik"};
		
		Double[] doubleDizi = {12.3,56.2,67.12};
		
		System.out.println("INT dizi");
		System.out.println("------------");
		yazdir(intDizi);
		
		System.out.println("String dizi");
		System.out.println("------------");
		yazdir(stringDizi);
		
		System.out.println("Double dizi");
		System.out.println("------------");
		yazdir(doubleDizi);
	}
	
	 public static <T> void yazdir(T[] dizi) {
		 for (T deger : dizi) {
			System.out.println(deger);
		}
	 }
}
