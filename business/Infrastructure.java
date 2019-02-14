package business;

public class Infrastructure {
	
	private String type;
	private String lieu;
	private boolean disponible;
	private Cours cours;
	
	/** Constructeur infrastructure 
	 * 
	 * @param nom Nom de l'infrastructure
	 * @param type Type de l'infrastructure
	 * @param disponible Si l'infrastructure est disponible ou non
	 */
	public Infrastructure (String type, String lieu, boolean disponible, Cours cours) {
		this.type = type;
		this.lieu = lieu;
		this.disponible = disponible;
		this.cours = cours;
	}

	

	/**
	 * @return le type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return la disponibilité
	 */
	public boolean isDisponible() {
		return disponible;
	}

	

	/**
	 * @param type le type à ajouté
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param disponible la disponibilité à ajouter
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}



	@Override
	public String toString() {
		return "Infrastructure [type=" + type + ", lieu=" + lieu + ", disponible=" + disponible + ", cours=" + cours
				+ "]";
	}
	
	

}
