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
	
			// Gestion des fournisseurs
			String nomFou = JOptionPane.showInputDialog("Saisissez le nom de votre fournisseur : ");
			String conFou = JOptionPane.showInputDialog("Saisissez le contact chez votre fournisseur : ");
			String telFou = JOptionPane.showInputDialog("Saisissez le téléphone de votre fournisseur : ");
			Fournisseur f1 = new Fournisseur (nomFou, conFou, telFou);
			
			nomFou = JOptionPane.showInputDialog("Saisissez le nom de votre fournisseur : ");
			conFou = JOptionPane.showInputDialog("Saisissez le contact chez votre fournisseur : ");
			telFou = JOptionPane.showInputDialog("Saisissez le téléphone de votre fournisseur : ");
			Fournisseur f2 = new Fournisseur (nomFou, conFou, telFou);
			
			// Gestion des produits
			String nomPro = JOptionPane.showInputDialog("Saisissez le nom de votre produit : ");
			int etaPro = Integer.parseInt(JOptionPane.showInputDialog("Saisissez l'état chez votre produit (un entier) : "));
			Produit produit1 = new Produit(nomPro, etaPro);
			
			nomPro = JOptionPane.showInputDialog("Saisissez le nom de votre produit : ");
			etaPro = Integer.parseInt(JOptionPane.showInputDialog("Saisissez l'état chez votre produit (un entier) : "));
			Produit produit2 = new Produit(nomPro, etaPro);
			
			nomPro = JOptionPane.showInputDialog("Saisissez le nom de votre produit : ");
			etaPro = Integer.parseInt(JOptionPane.showInputDialog("Saisissez l'état chez votre produit (un entier) : "));
			Produit produit3 = new Produit(nomPro, etaPro);
			
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
