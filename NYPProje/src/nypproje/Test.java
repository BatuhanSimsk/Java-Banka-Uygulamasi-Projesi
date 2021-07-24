package nypproje;

public class Test {

	public static void main(String[] args) {



		 //Burada parametre olarak verilen bakiye değerleri önemsiz, nesneyi tanımlarken kullanılıyor sadece, devamında yeni bakiye üzerine yazılıyor.
		 
		 
		
		 VadesizHesap vadesiz1 = new VadesizHesap(12000);
		 System.out.println("\n");
		 VadesizHesap vadesiz2 = new VadesizHesap(66000);
		 System.out.println("\n");
		 YatirimHesabi yatirim1 = new YatirimHesabi(50800);
		 System.out.println("\n");
		 YatirimHesabi yatirim2 = new YatirimHesabi(270000);
		 System.out.println("\n");
		 
		
		
		Musteri müsteri1 = new Musteri("Batuhan","Şimşek","batu@protonmail.com",50599999);
		Musteri müsteri2 = new Musteri("Tolga","Kanburoğlu","tolga@protonmail.com",53299999);
		
		
		
		
	    müsteri1.hesapEkle(50000, vadesiz1);  
		müsteri2.hesapEkle(25000, vadesiz2);
		müsteri1.hesapEkle(45000, yatirim1);
		müsteri2.hesapEkle(90000, yatirim2);
		
		System.out.println(vadesiz1.getBakiye());
		System.out.println(vadesiz2.getBakiye());
		System.out.println(yatirim1.getBakiye());
		System.out.println(yatirim2.getBakiye());
		
		System.out.println("Transfer Öncesi");
		
		System.out.println("Vadesiz1 Bakiye\n");
		System.out.println(vadesiz1.getBakiye());
		System.out.println("Vadesiz2 Bakiye\n");
		System.out.println(vadesiz2.getBakiye());
		
		vadesiz1.paraTransferi(vadesiz1, vadesiz2, 10000);
		
		System.out.println("\nTransfer Sonrasi");

		System.out.println("Vadesiz1 Bakiye\n");
		System.out.println(vadesiz1.getBakiye());
		System.out.println("Vadesiz2 Bakiye\n");
		System.out.println(vadesiz2.getBakiye());
		
		
		KrediKarti kredikarti = new KrediKarti(0,0);  //Burada verilen parametre değerleri de önemsiz,sadece nesne tanımalamak için. İlgili değerler metodlarda veriliyor.
		KrediKarti kredikarti2 = new KrediKarti(0,0);
		
		müsteri1.krediKartiEkle(100000, 2500,kredikarti);
		vadesiz1.krediKartiBorcOdeme(vadesiz1,kredikarti, 500);
		
		müsteri2.krediKartiEkle(100000, 3000, kredikarti2);
		vadesiz2.krediKartiBorcOdeme(vadesiz2, kredikarti2, 3000);
		
		yatirim1.paraCek(yatirim1, 5000);
		yatirim1.paraEkle(yatirim1, 12500);
		
		
		müsteri1.krediKartiSil(kredikarti);
		müsteri2.krediKartiSil(kredikarti2);
		
		müsteri1.hesapSil(yatirim1);
		
		
		yatirim2.paraCek(yatirim2, 90000);
		müsteri1.hesapSil(yatirim2);
		
		System.out.println(vadesiz1.toString());
		System.out.println(vadesiz2.toString());
		
		
		
	
	}

}
