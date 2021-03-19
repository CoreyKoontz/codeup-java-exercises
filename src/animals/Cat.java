package animals;

public class Cat extends Feline {

    private final String color;

    public Cat(int averageWeight, String commonName, String diet, String sound, String color) {
        super(averageWeight, commonName, diet, sound);
        this.color = color;
    }

    public void printColor() {
        System.out.printf("Color: %s%n", this.color);
    }

    public void printDetails(){

        printDelimiter();
        printCommonName();
        printDiet();
        printAverageWeight();
        printColor();
        printSound();
        printDelimiter();
    }



}
