package Animals;

public class Tiger extends Feline {

    private final boolean isEndangered;
    private final String nativeArea;

    public Tiger(int averageWeight, String commonName, String diet, String sound, boolean isEndangered, String nativeArea) {
        super(averageWeight, commonName, diet, sound);
        this.isEndangered = isEndangered;
        this.nativeArea = nativeArea;
    }

    public void printEndangeredStatus(){
        System.out.printf("Endangered: %s\n", getEndangeredStatus());
    }
    public void printNativeArea(){
        System.out.printf("Native Area: %s\n", this.nativeArea);
    }
    public void printDetails(){

        printDelimiter();
        printCommonName();
        printDiet();
        printAverageWeight();
        printNativeArea();
        printEndangeredStatus();
        printSound();
        printDelimiter();
    }
    private String getEndangeredStatus(){
        if (isEndangered){
            return "Yes";
        }else{
            return "No";
        }
    }
}
