package hust.soict.sec.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private double cost;

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setTitle(String title){
        this.title = title;
    }
    // Getters
    public String getCategory() {
        return category;
    }
    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }
    public double getCost() {
        return cost;
    }

    public Media(){}

}
