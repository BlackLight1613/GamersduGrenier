package business;

import java.util.ArrayList;

public class Fournisseur {
/**
 * declaration des variables de class
 */
	private String nomFour;
	private String contactFour;
	private String numTelFour;
	private ArrayList<Produit> listeProduit;
	/**
	 * constructeur de Fournisseur
	 * @param nomFour
	 * @param contactFour
	 * @param numTelFour
	 */
	public Fournisseur(String nomFour, String contactFour, String numTelFour) {
		super();
		this.nomFour = nomFour;
		this.contactFour = contactFour;
		this.numTelFour = numTelFour;
	}

	public String getNomFour() {
		return nomFour;
	}

	public String getContactFour() {
		return contactFour;
	}

	public String getNumTelFour() {
		return numTelFour;
	}
	
	public ArrayList<Produit> getListeProduit() {
		return listeProduit;
	}

	public void setNomFour(String nomFour) {
		this.nomFour = nomFour;
	}

	public void setContactFour(String contactFour) {
		this.contactFour = contactFour;
	}

	public void setNumTelFour(String numTelFour) {
		this.numTelFour = numTelFour;
	}

	public void setListeProduit(ArrayList<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}
	
	/**
	 * Methode qui ajoute un produit a la liste d'un fournisseur
	 * @param produit
	 */
	public void ajouterProduit(Produit produit) {
		this.listeProduit.add(produit);
	}
	
	/**
	 * Methode qui supprime un produit a la liste d'un fournisseur
	 * @param produit
	 */
	public void supprimerProduit(Produit produit) {
		this.listeProduit.add(produit);
	}

	/**
	 * affichage d'un message de presentation du produit
	 */
	@Override
	public String toString()
	{
		return "Le Fournisseur: " +getNomFour()+" contact: "+getContactFour()+" numero de telephone: "+getNumTelFour();
	}
	
}
