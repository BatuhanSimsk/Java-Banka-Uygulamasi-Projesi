package nypproje;

public class Kisi 
{
	private static String ad;
	private static String soyad;
	private static String email;
	private static int telefonNumarasi;
	
	
	//Constructor
	public Kisi(String ad, String soyad, String email, int telefonNumarasi) 
	{
		super();
		Kisi.ad = ad;
		Kisi.soyad = soyad;
		Kisi.email = email;
		Kisi.telefonNumarasi = telefonNumarasi;
	}

	//Getter ve Setter Metodların Yazılması
	public static String getAd() 
	{
		return ad;
	}

	public static void setAd(String ad) 
	{
		Kisi.ad = ad;
	}

	public static String getSoyad() 
	{
		return soyad;
	}

	public static void setSoyad(String soyad) 
	{
		Kisi.soyad = soyad;
	}

	public static String getEmail() 
	{
		return email;
	}

	public static void setEmail(String email) 
	{
		Kisi.email = email;
	}

	public static int getTelefonNumarasi() 
	{
		return telefonNumarasi;
	}

	public static void setTelefonNumarasi(int telefonNumarasi) 
	{
		Kisi.telefonNumarasi = telefonNumarasi;
	}

	
	//toString metodunun eklenmesi
	
	@Override
	public String toString() 
		{
		return "Kisi [ad=" + ad + ", soyad=" + soyad + ", email=" + email 
				+ ", telefonNumarasi=" + telefonNumarasi+ "]";
	}      
	

	
	



}
