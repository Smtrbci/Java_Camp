package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yoursef
		String internetSubeButonu = "Internet Subesi";
		
		double dolarDun = 8.15;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d??t? resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y?kseldi resmi");
		}
		else {
			System.out.println("Dolar e?ittir resmi");
		}
		
		String kredi1 = "Hizli Kredi";
		String kredi2 = "Mutlu emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Ciftci Kredisi";
		String kredi5 = "MSB Kredisi";
		String kredi6 = "MEB Kredisi";
		String kredi7 = "Kultur Bakanligi Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		
		String[] krediler = 
			{
				"Hizli Kredi",
				"Mutlu emekli Kredisi",
				"Konut Kredisi", 
				"Ciftci Kredisi",
				"MSB Kredisi",
				"MEB Kredisi",
				"Kultur Bakanligi Kredisi",
			};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		String sehir1 = "Ankara";
		String sehir2 = "Istanbul";
		sehir1 = sehir2;
		sehir2 = "Izmir";
		System.out.println(sehir1);
		
		
		
		
		
		
	}

}
