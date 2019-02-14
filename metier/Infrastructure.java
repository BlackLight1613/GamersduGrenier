package metier;

import metier.cours;

public class Infrastructure {
	
	private String nom;
	private String type;
	private String lieu;
	private boolean disponible;
	private Cours cours;
	
	/** Constructeur infrastructure 
	 * 
	 * @param nom Nom de l'infrastructure
	 * @param type Type de l'infrastructure
	 * @param lieu Lieu de l'infrastructure
	 * @param disponible Si l'infrastructure est disponible ou non
	 */
	public Infrastructure (String nom, String type, String lieu, boolean disponible, Cours cours) {
		this.nom = nom;
		this.type = type;
		this.lieu = lieu;
		this.disponible = disponible;
		this.cours = cours;
	}

	/**
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return le type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * 
	 * @return le lieu
	 */
	public String getLieu() {
		return lieu;
	}

	/**
	 * @return la disponibilité
	 */
	public boolean isDisponible() {
		return disponible;
	}
	
	/**
	 * 
	 * @return le cours
	 */
	public Cours getCours() {
		return cours;
	}

	/**
	 * @param nom le nom à ajouter
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param type le type à ajouter
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * 
	 * @param lieu le lieu à ajouter
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	/**
	 * @param disponible la disponibilité à ajouter
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		String msg="";
		msg = "L'infrastructure s'appelle " + nom + ", son type est " + type + ", elle se trouve =" + lieu + ", et elle est ";
		if (disponible) {
			msg = msg + "disponible.";
		}
		else {
			msg = msg + "indisponible.";		}
		return msg;
	}
	
	

}
