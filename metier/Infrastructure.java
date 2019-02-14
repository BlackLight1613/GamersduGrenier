package metier;

public class Infrastructure {
	
	private String nom;
	private String type;
	private boolean disponible;
	
	/** Constructeur infrastructure 
	 * 
	 * @param nom Nom de l'infrastructure
	 * @param type Type de l'infrastructure
	 * @param disponible Si l'infrastructure est disponible ou non
	 */
	public Infrastructure (String nom, String type, boolean disponible) {
		this.nom = nom;
		this.type = type;
		this.disponible = disponible;
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
	 * @return la disponibilit�
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * @param nom le nom � ajout�
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param type le type � ajout�
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param disponible la disponibilit� � ajouter
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	

}
