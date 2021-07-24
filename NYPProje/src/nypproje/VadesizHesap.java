package nypproje;

public class VadesizHesap extends BankaHesabi
{
	private String hesapTürü;

	public VadesizHesap(double bakiye) 
	{
		super(bakiye);
		
	}

	
	//toString
	@Override
	public String toString() 
	{
		return super.toString() + "VadesizHesap [hesapTürü=" + hesapTürü + "]";
	}
	
	
	public void paraTransferi(BankaHesabi hesap1,BankaHesabi hesap2,double bakiye) 
	{
		hesap1.setBakiye(hesap1.getBakiye()-bakiye);
		hesap2.setBakiye(hesap2.getBakiye()+bakiye);
	}
	
	public void krediKartiBorcOdeme(BankaHesabi bankahesap,KrediKarti kredikarti,double miktar) 
	{
		System.out.println("Ödeme öncesi borc:");
		System.out.println(kredikarti.getGuncelBorc());
		kredikarti.setGuncelBorc(kredikarti.getGuncelBorc()-miktar);
		System.out.println("Ödeme sonrası borc:");
		System.out.println(kredikarti.getGuncelBorc());
		bankahesap.setBakiye(bankahesap.getBakiye()-miktar);
	}
}
