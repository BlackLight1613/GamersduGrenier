package business;

public class Fournisseur {
/**
 * declaration des variables de class
 */
	private String nomFour;
	private String contactFour;
	private String numTelFour;
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

	public void setNomFour(String nomFour) {
		this.nomFour = nomFour;
	}

	public void setContactFour(String contactFour) {
		this.contactFour = contactFour;
	}

	public void setNumTelFour(String numTelFour) {
		this.numTelFour = numTelFour;
	}
	
	/**
	 * affichage d'un message de presentation du produit
	 */
	@Override
	public String toString()
	{
		return "Le Fournisseur: " +getNomFour()+" adresse: "+getContactFour()+" numero de telephone: "+getNumTelFour();
	}
	
}
