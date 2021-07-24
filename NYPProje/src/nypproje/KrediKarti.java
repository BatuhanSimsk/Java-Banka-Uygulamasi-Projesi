package nypproje;

import java.util.concurrent.ThreadLocalRandom;

public class KrediKarti 
{
	long en_kücük= 1000_1000_1000_1000L;
	long en_büyük= 9999_9999_9999_9999L;
	
	long random_kartNo =ThreadLocalRandom.current().nextLong(en_kücük,en_büyük); //16 Haneli rastgele kart numarası oluşturmak için kullanılan bölüm
	
	private long kartNumarasi =random_kartNo;
	private double limit;
	private double guncelBorc;
	private double kullanilabilirLimit;
	
	
	//Constructor
	public KrediKarti(double limit, double guncelBorc) 
	{
		super();
		this.limit = limit;
		this.guncelBorc = guncelBorc;
	}

	
	//Getter-Setter Metotlar
	
	public double getLimit() 
	{
		return limit;
	}

	public void setLimit(double limit) 
	{
		this.limit = limit;
	}

	public double getGuncelBorc() 
	{
		return guncelBorc;
	}

	public void setGuncelBorc(double guncelBorc) 
	{
		this.guncelBorc = guncelBorc;
	}


	//toString
	@Override
	public String toString() 
	{
		return super.toString() + "KrediKarti [kartNumarasi=" + kartNumarasi + ", limit=" + limit + ", guncelBorc=" + guncelBorc
				+ ", kullanilabilirLimit=" + kullanilabilirLimit + "]";
	}
}
