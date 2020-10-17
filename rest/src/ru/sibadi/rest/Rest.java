package ru.sibadi.rest;

public class Rest {
    private final String name;
    private final Food[] menu;

    public Rest() {
        this.name = "Wellnus";
        this.menu = new Food[]{
                new Food("Borsh", 12.5),
                new Food("Kompot", 4.5),
                new Food("Fuagra", 1000.00),
                new Food("Kruton", 200.00)
        };
    }

    public String getName() {
        return name;
    }

    public Food[] getMenu() {
        return menu;
    }
}
