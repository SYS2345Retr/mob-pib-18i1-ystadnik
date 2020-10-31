package ru.sibadi.rest;

public class Rest {
    private final String name;
    private final Food[] menu;
    private final Table[] tables;

    public Rest() {
        this.name = "Wellnus";
        this.menu = new Food[]{
                new Food("Borsh", 12.5),
                new Food("Kompot", 4.5),
                new Food("Fuagra", 1000.00),
                new Food("Kruton", 200.00)
        };
        this.tables = new Table[]{
                new Table("U1",120.0),
                new Table("U2", 240.0),
                new Table("A2", 450.0)
        };
    }

    public String getName() {
        return name;
    }

    public Food[] getMenu() {
        return menu;
    }

    public Table[] getTables() {
        return tables;
    }
}
