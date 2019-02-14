package business;

public class Cheval {
	
	private String nom;
	private String race;
	private String genre;
	private Box box;
	
	
	/** Constructeur cheval
	 * 
	 * @param nom Nom du cheval
	 * @param race Race du cheval (Pur Sang Arabe, Camargue, Cob Normand...)
	 * @param genre Genre du cheval (Hongre, étalon, jument)
	 */
	public Cheval(String nom, String race, String genre, Box box) {
		this.nom = nom;
		this.race = race;
		this.genre = genre;
	}

	
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


	@Override
	public String toString() {
		return "Cheval [nom=" + nom + ", race=" + race + ", genre=" + genre + ", box=" + box + "]";
	}
	
	

}
