package movies;

public class Movie {

    // ------------------------------------------------------ Private fields for name and category:

    private String name;

    private String category;

    // ------------------------------------------------------ Constructor:

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // ------------------------------------------------------ Getters:

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    // ------------------------------------------------------ Setters:

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
