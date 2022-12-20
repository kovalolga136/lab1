//package rfe.bsu.laba1;

public class Cheese extends Food {
    @Override
    public int calculateCalories() {
        return 12;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                ", colories=" + colories +
                '}';
    }

    public Cheese(String name, double colories) {
        super(name, colories);
    }

    public Cheese(String name) {
        super(name);
        this.colories = calculateCalories();
    }

    @Override
    public String getSpecial() {
        return "0";
    }

    public Cheese() {
    }
}
