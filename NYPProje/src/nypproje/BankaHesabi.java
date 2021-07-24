package nypproje;

import java.util.Random;

public class BankaHesabi 
{
	public static String ibanGenerator()  //Rastgele IBAN oluşturmak için kullanılan metot.
	  {
	    Random rand = new Random();
	    String iban = "TR";
	    for (int i = 0; i < 24; i++)
	    {
	        int n = rand.nextInt(10) + 0;
	        iban += Integer.toString(n);
	    }
	    for (int i = 0; i < 26; i++)
	    {
	        if(i % 4 == 0)
	          System.out.print(" ");
	        System.out.print(iban.charAt(i));
	    }
		return iban;
	  }

	
	private  String IBAN = ibanGenerator();
	private double bakiye;
	
	public BankaHesabi(double bakiye) 
	{
		super();
		this.bakiye = bakiye;
	}

	
	//toString	
	@Override
	public String toString() 
	{
		return  "BankaHesabi [iban=" + IBAN + ", bakiye=" + bakiye + "]";
	}


	//Getter-Setter Metotların Yazılması
	
	public double getBakiye() 
	{
		return bakiye;
	}


	public void setBakiye(double bakiye) 
	{
		this.bakiye = bakiye;
	}


	public String getIban() 
	{
		return IBAN;
	}


	public void setIban(String iban) 
	{
		this.IBAN = iban;
	}
}

