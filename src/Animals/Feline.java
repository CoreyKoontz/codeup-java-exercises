package Animals;

public abstract class Feline implements Describable {

    protected final int averageWeight;
    protected final String commonName;
    protected final String diet;
    protected final String sound;

    // Constructor:
    public Feline(int averageWeight, String commonName, String diet, String sound) {
        this.averageWeight = averageWeight;
        this.commonName = commonName;
        this.diet = diet;
        this.sound = sound;
    }

    public void printDelimiter() {
        System.out.println("****************************");
    }

    public void printCommonName() {
        System.out.printf("Common Name: %s%n", this.commonName);
    }

    public void printAverageWeight() {
        System.out.printf("Average Weight: %d lbs.%n", this.averageWeight);
    }

    public void printDiet() {
        System.out.printf("Common Diet: %s%n", this.diet);
    }

    public void printSound() {
        System.out.printf("Sound: %s%n", this.sound);
    }

}
