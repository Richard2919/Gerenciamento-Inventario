package entity;

import java.util.*;
import java.util.stream.Collectors;

public class Produto {
    private int Id;
    private String name;
    private int quantity;
    private double value;

    public Produto(int id, String name, int quantity, double value) {
        Id = id;
        this.name = name;
        this.quantity = quantity;
        this.value = value;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Id == produto.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }
}
