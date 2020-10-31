package ru.sibadi.rest;

public class Table {
    private final String nameTable;
    private final double price;

    public Table(String nameTable, double price) {
        this.nameTable = nameTable;
        this.price = price;
    }

    public String getNameTable() {
        return nameTable;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Table: " + nameTable + " Price: " + price;
    }
}
