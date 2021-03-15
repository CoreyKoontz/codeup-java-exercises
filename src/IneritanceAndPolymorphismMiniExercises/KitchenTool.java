package IneritanceAndPolymorphismMiniExercises;

public class KitchenTool {

    // --------------------- Fields -----------------------------------------
    public String name;

    public boolean washable;

    public boolean clean;

    public boolean onHand;

    // -------------------- Methods ---------------------------------------
    public void storeTools() {
        onHand = false;
        System.out.println("tools were put away");
    }

    public void getTools (){
        onHand = true;
        System.out.println("Now have tools");
    }

    public void washTools() {
        System.out.println("Tools have been washed");
    }

    // Getter:
    public String getName() {
        return name;
    }

    // ------------------ Constructor -----------------------------------------
    public KitchenTool(String name) {
        this.name = name;
        this.clean = true;
        this.washable = true;
        this.onHand = false;
    }
}
