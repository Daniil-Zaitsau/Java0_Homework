package JNullOOP;

abstract class Confection {
    private int weight;
    private int sugar;
    private String  name;

    Confection(int weight, int sugar, String name) {
        this.weight = weight;
        this.sugar = sugar;
        this.name = name;

    }

    int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    int getSugar() {
        return sugar;
    }

    String getName(){return name;}

}
