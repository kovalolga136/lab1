// package rfe.bsu.laba1;

import java.util.Objects;

public class Lemonade extends Food{

    protected String taste = null;

    public Lemonade(String name, double colories, String taste) {
        super(name, colories);
        this.taste = taste;
    }

    public Lemonade(String name, String taste) {
        super(name);
        this.taste = taste;
        this.colories = calculateCalories();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lemonade)) return false;
        if (!super.equals(o)) return false;
        Lemonade Lemonade = (Lemonade) o;
        return Objects.equals(taste, Lemonade.taste);
    }

    @Override
    public String toString() {
        return "Lemonade{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int calculateCalories() {
        return (taste.length() * 100);
    }

    @Override
    public String getSpecial() {
        return taste;
    }
}
