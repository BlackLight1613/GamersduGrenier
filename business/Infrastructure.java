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

	//--------------------------------------------------------------------------------------------------------------

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
	 * @return the lieu
	 */
	public String getLieu() {
		return lieu;
	}


	/**
	 * @return the cours
	 */
	public Cours getCours() {
		return cours;
	}

	//--------------------------------------------------------------------------------------------------------------

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

	

	//--------------------------------------------------------------------------------------------------------------
	
	/**
	 * @param lieu le lieu à ajouter
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	/**
	 * @param cours le cours à ajouter
	 */
	public void setCours(Cours cours) {
		this.cours = cours;
	}

	@Override
	public String toString() {
		String msg ="";
		msg = "L'infrastructure est de type " + type + ", se trouve sur le  lieu " + lieu +" ";
		if (disponible) {
			msg = msg + "disponible ";
		}
		else {
			msg = msg + "indisponible ";
		}
		msg = msg + "pour le cours "+cours+".";
		return msg;
	}
	
	

}
