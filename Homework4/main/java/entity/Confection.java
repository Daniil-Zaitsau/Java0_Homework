package entity;

public abstract class Confection {
    private int weight;
    private int sugar;
    private String  name;
    private int quantity;

    Confection(int weight, int sugar, String name) {
        this.weight = weight;
        this.sugar = sugar;
        this.name = name;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Confection() {

    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSugar() {
        return sugar;
    }

    public String getName(){return name;}

    @Override
    public String toString() {
        return  "weight = " + weight +
                ", sugar = " + sugar +
                ", name = " + name;
    }
}
