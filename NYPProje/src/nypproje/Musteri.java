package nypproje;

import java.util.ArrayList;
import java.util.Random;

public class Musteri extends Kisi
{
	
	Random rand = new Random();		 	//Rastgele Müsteri Numarası üretmek için kullanılan bölüm
	int rand_int = rand.nextInt(15000); 	
	private int musteriNumarasi =rand_int;
	
	private static  ArrayList <KrediKarti> krediKartlari;
	private static  ArrayList <BankaHesabi> hesaplar;
	
	
	//Constructor
	
	public Musteri(String ad, String soyad, String email, int telefonNumarasi) 
	{
		super(ad, soyad, email, telefonNumarasi);
		krediKartlari=new ArrayList<>();
		hesaplar=new ArrayList<>();
	}
	
	//toString
	
	@Override
	public String toString() 
	{
		return super.toString() + "Musteri [musteriNumarasi=" + musteriNumarasi + ", hesaplar=" + hesaplar + ", krediKartlari="
				+ krediKartlari + ", krediKarti=" + krediKartlari + ", bankaHesabi=" + hesaplar + "]";
	}
	
	
	
	
	//Metotlar//
	
	public   void hesapEkle(double bakiye,VadesizHesap vadesizHesap) 
	{
		vadesizHesap.setBakiye(bakiye);
		hesaplar.add(vadesizHesap);
		System.out.println("Vadesiz Hesap açıldı");
	}
	
	public  void hesapEkle(double bakiye,YatirimHesabi yatirimHesabi ) 
	{
		yatirimHesabi.setBakiye(bakiye);
		hesaplar.add(yatirimHesabi);
		System.out.println("Yatırım Hesabı açıldı");
	} 

	public  void krediKartiEkle(double limit,double borc,KrediKarti kredikarti) 
	{
		kredikarti.setLimit(limit);
		kredikarti.setGuncelBorc(borc);	
		krediKartlari.add(kredikarti);		
		System.out.println("Kredi karti eklendi");
	}
	
	
	public void krediKartiSil(KrediKarti kredikarti)
	{
		if(kredikarti.getGuncelBorc()==0) 
		{
			System.out.println("\nBorcunuz yoktur,kredi karti silinecektir.");
			krediKartlari.remove(kredikarti);
		}
		else if (kredikarti.getGuncelBorc()>0)
		{
			System.out.println("\nLütfen öncelikle borç ödemenizi yapınız... ");
			System.out.println("Güncel Borcunuz: "+kredikarti.getGuncelBorc());
		}
	}

	public void hesapSil(BankaHesabi hesap)
	{
		if(hesap.getBakiye()==0) 
		{
			System.out.println("\nHesabiniz silinecektir.");
			hesaplar.remove(hesap);
		}
		else if (hesap.getBakiye()>0)
		{
			System.out.println("\nLütfen öncelikle bakiyenizi başka bir hesaba aktarınız... ");
		}
	}
	
}