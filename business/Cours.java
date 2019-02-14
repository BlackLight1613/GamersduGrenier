package business;

import java.time.LocalDate;
/**
 * 
 * 
 * @author Eldin Anthony
 * Date : 14/02/2019
 */
public class Cours 
{
	private Cheval cheval;
	private LocalDate dateCours;

	public Cours (Cheval cheval, LocalDate date)
	{
		setCheval(cheval);
		setDate(date);
	}
	
	private void setCheval (Cheval cheval)
	{
		this.cheval=cheval;
	}
	
	
	//Pour un cours nous ne renverrons que le nom du cheval 
	public String getCheval()
	{
		return cheval.getNom();
	}
	
	private void setDate(LocalDate date)
	{
		this.dateCours=date;
	}
	
	public String getDateCours()
	{
		return dateCours.toString();
	}
	
	private String getJour(LocalDate date)
	{
		String jour ="";
		
		jour = date.getDayOfWeek().toString();
		switch (jour)
		{
		case "MONDAY" : 	jour = "Lundi";
							break;
						
		case "TUESDAY" : 	jour = "Mardi";
							break;
		
		case "WEDNESDAY" : 	jour = "Mercredi";
							break;
		
		case "THURSDAY" : 	jour = "Jeudi";
							break;
		
		case "FRIDAY" : 	jour = "Jeudi";
							break;
		
		case "SATURDAY" : 	jour = "Samedi";
							break;
			
		case "SUNDAY" : 	jour = "Dimanche";
							break;
		
		default : 			jour = "Inconnu";
							break;
		}	
		return jour;
	}
	
	@Override
	public String toString()
	{
		return "Le cours avec le cheval" + cheval.getNom()+ " a lieu le " +this.getJour(dateCours);
	}
	
}
