package app;

import java.time.LocalDate;

import business.Box;
import business.Cheval;
import business.Cours;
import business.Fournisseur;
import business.Infrastructure;
import business.Produit;

public class Application 
{

	public static void main(String[] args) 
	{
	
			Fournisseur fournisseur = new Fournisseur ("Cheval 3000","Guillaume", "0606060606");
			Box box = new Box(10,"Fond");
			Produit produit = new Produit("Hipposandale", 1,fournisseur);
			Cheval cheval = new Cheval("Ponpon","PurSang","Etalon",box, produit);
			
			Cours cours = new Cours (cheval,LocalDate.now());
			Infrastructure infra = new Infrastructure("Quai 9-3/4","Carrière",true,cours);
			
			System.out.println(fournisseur);
			System.out.println(box);
			System.out.println(produit);
			System.out.println(cheval);
			System.out.println(cours);
			System.out.println(infra);
			
			
	}
	
	
}
