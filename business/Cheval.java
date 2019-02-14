package business;

public class Cheval {
	
	private String nom;
	private String race;
	private String genre;
	private Box box;
	private Produit produit;
	
	
	/** Constructeur cheval
	 * 
	 * @param nom Nom du cheval
	 * @param race Race du cheval (Pur Sang Arabe, Camargue, Cob Normand...)
	 * @param genre Genre du cheval (Hongre, étalon, jument)
	 * @param box Box où habite le cheval
	 * @param produit Produit équipant le cheval
	 */
	public Cheval(String nom, String race, String genre, Box box, Produit produit) {
		this.nom = nom;
		this.race = race;
		this.genre = genre;
		this.box = box;
		this.produit = produit;
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
	public Produit getProduit() {
		return produit;
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
	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	//-----------------------------------------------------------------------------------------------------------

	
	@Override
	public String toString() {
		String msg ="";
		msg = "Le cheval s'appelle " + nom + ", sa race est " + race + ", son genre est " + genre + ", son box est " + box 
				+ " et il a pour produit " + produit;
		return msg;
	}
	
	

}
