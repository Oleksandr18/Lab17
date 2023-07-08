package Lab17_4;

import java.util.Objects;

public class Animal {
    private String name = "Васька";
    private int years = 45;
    private boolean tail = false;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }

    public boolean isTail() {
        return tail;
    }
    public void setTail(boolean tail) {
        this.tail = tail;
    }


    @Override       //перевизначений метод toString.
    public String toString() {
        return super.toString() + " Имя: " + name + ", лет: " + years + ", хвост: " + tail;
    }


    @Override       //перевизначений метод equals & hashCode
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return years == animal.years && tail == animal.tail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, years, tail);
    }
}
