package app;

import java.time.LocalDate;

import business.Box;

public class Application 
{

	public static void main(String[] args) 
	{
	
			Box box = new Box(10,"Fond");
			Cheval cheval = new Cheval("Ponpon","PurSang","Etalon",box);
			Cours cours = new Cours (cheval,LocalDate.now());
			Infrastructure infra = new Infrastructure(10,"Quai 9-3/4","Carrière",true,cours);
			
			System.out.println(box);
			System.out.println(cheval);
			System.out.println(cours);
			System.out.println(infra);
			
	}
	
	
}
