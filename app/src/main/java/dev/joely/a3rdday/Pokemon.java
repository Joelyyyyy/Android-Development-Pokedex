package dev.joely.a3rdday;

public class Pokemon {
    private final int id; // Add this field
    private final String name;
    private final String type;

    public Pokemon(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
