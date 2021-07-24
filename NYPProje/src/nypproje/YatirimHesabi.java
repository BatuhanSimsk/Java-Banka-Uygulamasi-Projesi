package nypproje;

public class YatirimHesabi extends BankaHesabi
{
	private String hesapTürü;

	
	//Constructor
	public YatirimHesabi(double bakiye) 
	{
		super(bakiye);	
	}

	//toString
	
	@Override
	public String toString() 
	{
		return super.toString() +  "YatirimHesabi [hesapTürü=" + hesapTürü + "]";
	}
	
	
	//Metotlar
	
	public void paraEkle(YatirimHesabi hesap,double miktar) 
	{
		System.out.println("Eski bakiye: "+hesap.getBakiye());
		hesap.setBakiye(hesap.getBakiye()+miktar);
		System.out.println("Yeni bakiye: "+hesap.getBakiye());
	}
	
	public void paraCek(YatirimHesabi hesap,double miktar) 
	{
		System.out.println("Eski bakiye: "+hesap.getBakiye());
		hesap.setBakiye(hesap.getBakiye()-miktar);
		System.out.println("Yeni bakiye: "+hesap.getBakiye());
	}
	

}
