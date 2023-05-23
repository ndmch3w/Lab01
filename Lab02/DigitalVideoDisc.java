package lab_02;

public class DigitalVideoDisc {
	//Constructors
	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, double cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, double cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	
	// Attributes
	private String title;
	private String category;
	private String director;
	private int length;
	private double cost;
	
	// Getters
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public double getCost() {
		return cost;
	}
	
	public boolean isSame(DigitalVideoDisc disc) {
		if (this.title.equals(disc.title) && this.category.equals(disc.category) && 
				this.director.equals(disc.director) && this.length==disc.length && this.cost==disc.cost) {
			return true;
		}
		return false;
	}
}
