package app;

import java.time.LocalDate;

import javax.swing.JOptionPane;

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
	
			//Fournisseur f1= new Fournisseur("test", "test", "test");
			
			String affichageFenetreInfo = "Fournisseur : %s , Contact : %s , Téléphone : %s";
			affichageFenetreInfo= String.format(affichageFenetreInfo, f1.getNomFour(),f1.getContactFour(),f1.getNumTelFour());
			JOptionPane.showMessageDialog(null, affichageFenetreInfo);
			String affichageListeProduit = "Voici la liste des produits :\n";
			affichageFenetreInfo= affichageFenetreInfo+f1.afficherListeProduit();
			JOptionPane.showMessageDialog(null, affichageFenetreInfo);
			
			
			
	}
	
	
}
