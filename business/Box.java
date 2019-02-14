package business;

public class Box
{
	private int numBox;
	private String lieu;

	public Box (int numBox, String lieu)
	{
		setNumBox(numBox);
		setLieu(lieu);
	}

	public int getNumBox() {
		return numBox;
	}

	public void setNumBox(int numBox) {
		this.numBox = numBox;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	@Override
	public String toString()
	{
		return "Le box" +this.numBox+" se situe => "+this.lieu;
	}
	
}
