package nypproje;

import java.util.ArrayList;
import java.util.Random;

public class BankaPersoneli extends Kisi
{
	Random rand = new Random();		//Rastgele PersonelID oluşturma
	int rand_int = rand.nextInt(2500); 
	private int personelID =rand_int;
	
	private static ArrayList<Musteri> musteriler = new ArrayList<>();
	
	
	
	
	public BankaPersoneli(String ad, String soyad, String email, int telefonNumarasi) 
	{
		super(ad, soyad, email, telefonNumarasi);
		
	
	}
	
	
	//Getter-Setter metodların yazılması
	
	public int getPersonelID() 
	{
		return personelID;
	}


	public void setPersonelID(int personelID) 
	{
		this.personelID = personelID;
	}


	public ArrayList<Musteri> getMusteriler() 
	{
		return musteriler;
	}


	public void setMusteriler(ArrayList<Musteri> musteriler) 
	{
		BankaPersoneli.musteriler = musteriler;
	}


	
	//toString
	@Override
	public String toString() 
	{
		return super.toString() + "BankaPersoneli [personelID=" + personelID + ", musteriler=" + musteriler + "]";
	}
	
	
	
	
	public void addMusteri(Musteri musteri) 
	{
		musteriler.add(musteri);
	}


	
	
}
