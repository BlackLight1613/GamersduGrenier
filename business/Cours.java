package business;

import java.time.LocalDate;
/**
 * 
 * 
 * @author Eldin Anthony
 *
 */
public class Cours 
{
	private Cheval cheval;
	private LocalDate date;

	public Cours (Cheval cheval, LocalDate date)
	{
		this.cheval=cheval;
		this.date=date;
	}
	
	private String getJour(LocalDate date)
	{
		String jour ="";
		
		jour = date.getDayOfWeek().toString();
		switch (jour)
		{
		case "MONDAY" : jour = "Lundi";
						break;
						
		case "TUESDAY" : jour = "Mardi";
		break;
		
		case "WEDNESDAY" : jour = "Mercredi";
		break;
		
		case "THURSDAY" : jour = "Jeudi";
		break;
		
		case "FRIDAY" : jour = "Jeudi";
		break;
		
		case "SATURDAY" : jour = "Samedi";
		break;
		
		case "SUNDAY" : jour = "Dimanche";
		break;
		
		default : jour = "Inconnu";
		break;
		
		}
		
		
		return jour;
		
	}
	
	@Override
	public String toString()
	{
		return "Le cours avec le cheval" + cheval.getNom()+ " a lieu le " +this.getJour(date);
	}
	
}
