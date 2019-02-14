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
		
		
		
		
		return jour;
		
	}
	
	@Override
	public String toString()
	{
		return "Le cours avec le cheval" + cheval.getNom()+ " a lieu le " +this.getJour(date);
	}
	
}
