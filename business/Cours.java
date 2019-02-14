package business;

import java.time.LocalDate;

public class Cours 
{
	private Cheval cheval;
	private LocalDate date;

	public Cours (Cheval cheval, LocalDate date)
	{
		this.cheval=cheval;
		this.date=date;
	}
	
	@Override
	public String toString()
	{
		return "Le cours avec le cheval" +cheval.getNom()+ " a lieu le " +this.date.getDayOfWeek();
	}
	
}
