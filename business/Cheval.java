package business;

import java.util.ArrayList;

public class Cheval {
	
	private String nom;
	private String race;
	private String genre;
	private Box box;
	private ArrayList<Produit> listeProduit;
	
	
	/** Constructeur cheval
	 * 
	 * @param nom Nom du cheval
	 * @param race Race du cheval (Pur Sang Arabe, Camargue, Cob Normand...)
	 * @param genre Genre du cheval (Hongre, étalon, jument)
	 * @param box Box où habite le cheval
	 * @param produit Produit équipant le cheval
	 */
	public Cheval(String nom, String race, String genre, Box box, ArrayList<Produit> listeProduit) {
		this.nom = nom;
		this.race = race;
		this.genre = genre;
		this.box = box;
		this.listeProduit = listeProduit;
	}

	//-----------------------------------------------------------------------------------------------------------
	
	/** Getter sur le nom
	 * 
	 * @return Retourne le nom du cheval
	 */
	public String getNom() {
		return nom;
	}
	
	/** Getter sur la race
	 * 
	 * @return Retourne la race du cheval
	 */
	public String getRace() {
		return race;
	}

	/** Getter sur le genre
	 * 
	 * @return Retourne le genre du cheval 
	 */
	public String getGenre() {
		return genre;
	}
	
	/** Getter sur le box
	 * 
	 * @return le box
	 */
	public Box getBox() {
		return box;
	}

	/** Getter sur le produit
	 * 
	 * @return le produit
	 */
	public ArrayList<Produit> getProduit() {
		return listeProduit;
	}
	
	//-----------------------------------------------------------------------------------------------------------
	
	/** Setter sur le nom
	 * 
	 * @param nom Nom du cheval
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Setter sur la race
	 * 
	 * @param race Race du cheval
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/** Setter sur le genre du cheval
	 * 
	 * @param genre Genre du cheval
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String marcher() {
		String msg ="";
		msg = "Le cheval marche au pas.";
		return msg;
	}
	
	
	/** Setter sur le box
	 * 
	 * @param box Le box où va resider le cheval
	 */
	public void setBox(Box box) {
		this.box = box;
	}
	
	/** Setter sur le produit
	 * 
	 * @param produit Le produit équipant un cheval
	 */
	public void setProduit(ArrayList<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}

	//-----------------------------------------------------------------------------------------------------------

	/** Méthode qui ajoute un produit à la liste de produit du cheval
	 * 
	 * @param produit Le produit à ajouter à la liste des produits
	 */
	public void ajouterProduit(Produit produit) {
		listeProduit.add(produit);
	}
	
	/** Méthode qui supprime un produit de la liste de produit du cheval
	 * 
	 * @param produit Le produit à supprimer de la liste des produits
	 */
	public void supprimerProduit(Produit produit) {
		listeProduit.remove(produit);
	}
	
	/** Méthode d'affichage d'un cheval
	 * 	
	 */
	@Override
	public String toString() {
		String msg ="";
		msg = "Le cheval s'appelle " + nom + ", sa race est " + race + ", son genre est " + genre + ", son box est " + box 
				+ " et il a pour produits " + listeProduit;
		return msg;
	}
	
	

}
