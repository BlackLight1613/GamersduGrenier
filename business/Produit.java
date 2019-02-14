package business;

public class Produit {
	
	/**
	 * declaration des variables de class
	 */
	private String nomProduit;
	private int etatProduit;
	
	/**
	 * Constructeur de Produit
	 * @param nom
	 * @param etat  
	 * @param fournisseur
	 */
	public Produit(String nom, int etat) {
		this.nomProduit = nom;
		this.etatProduit = etat;
	}

	public String getNom() {
		return nomProduit;
	}

	public int getEtat() {
		return etatProduit;
	}

	public void setNom(String nom) {
		this.nomProduit = nom;
	}

	public void setEtat(int etat) {
		this.etatProduit = etat;
	}

	
	/**
	 * affichage d'un message de presentation du produit
	 */
	@Override
	public String toString()
	{
		return "Le produit: " +getNom()+" dans un etat: "+getEtat();
	}
}
