public class DigitalVideoDisc {
    //Constructors
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDisc++;
    }
    public DigitalVideoDisc(String title, String category, String director, double cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDisc++;
    }
    public DigitalVideoDisc(String title, String category, double cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc++;
    }
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        nbDigitalVideoDisc++;
    }

    // Attributes
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;
    public static int nbDigitalVideoDisc = 0;

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
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isSame(DigitalVideoDisc disc) {
        if (this.title.equals(disc.title) && this.category.equals(disc.category) &&
                this.director.equals(disc.director) && this.length==disc.length && this.cost==disc.cost) {
            return true;
        }
        return false;
    }
}