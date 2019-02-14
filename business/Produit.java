package business;

public class Produit {
	
	/**
	 * declaration des variables de class
	 */
	private String nomProduit;
	private int etatProduit;
	private Fournisseur fournisseur;
	
	/**
	 * Constructeur de Produit
	 * @param nom
	 * @param etat  
	 * @param fournisseur
	 */
	public Produit(String nom, int etat, Fournisseur fournisseur) {
		super();
		this.nomProduit = nom;
		this.etatProduit = etat;
		this.fournisseur = fournisseur;
	}

	public String getNom() {
		return nomProduit;
	}

	public int getEtat() {
		return etatProduit;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setNom(String nom) {
		this.nomProduit = nom;
	}

	public void setEtat(int etat) {
		this.etatProduit = etat;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	/**
	 * affichage d'un message de presentation du produit
	 */
	@Override
	public String toString()
	{
		return "Le produit: " +getNom()+" dans un etat: "+getEtat()+" du fournisseur: "+getFournisseur();
	}
}
