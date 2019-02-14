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
	
			Fournisseur f1 = new Fournisseur ("Cheval 3000","Guillaume", "0606060606");
			Fournisseur f2 = new Fournisseur ("New Generation Dada", "Karim", "0707070707");
			
			
			Produit produit1 = new Produit("Hipposandale", 1);
			Produit produit2 = new Produit("Tapis",9);
			Produit produit3 = new Produit("Selle",3);
			
			f1.ajouterProduit(produit1);
			f1.ajouterProduit(produit2);
			System.out.println("Voyons le fournisseur 1 :");
			System.out.println(f1);
			f2.ajouterProduit(produit3);
			System.out.println("----------------------------------------------------------------");
			System.out.println("Voyons le fournisseur 2 :");
			System.out.println(f2);
			f2.supprimerProduit(produit3);
			
			Box box = new Box(10,"Fond");
			
			Cheval cheval = new Cheval("Ponpon","PurSang","Etalon",box, produit1);
			cheval.ajouterProduit(produit3);
			System.out.println("----------------------------------------------------------------");
			System.out.println("Voyons le cheval");
			System.out.println(cheval);
			cheval.supprimerProduit(produit1);
			System.out.println("----------------------------------------------------------------");
			System.out.println("Voyons le cheval");
			System.out.println(cheval);
			
			Cours cours = new Cours (cheval,LocalDate.now());
			Infrastructure infra = new Infrastructure("Quai 9-3/4","Carrière",true,cours);
			
			
			
			
	}
	
	
}
