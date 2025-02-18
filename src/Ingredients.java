public class Ingredients {
    private String name;
    private String quantity;

    public Ingredients(String name, String quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return quantity + " of " + name;
    }
}
