package com.example.gpcorser.bitsandpizzas;

/**
 * Created by gpcorser on 11/7/2016.
 */

public class Item2 {
    private String name;
    private String description;
    private String prerequisite;

    public static final Item2[] items = {
            new Item2("MATH 103", "test1", "class1"),
            new Item2("COMM 105A", "test2", "class2"),
            new Item2("MATH 161", "test3", "class3"),
            new Item2("PHIL 205A (or 210B)", "test4", "class4"),
            new Item2("CS 105 (or CS 107A)", "test5", "class5"),
            new Item2("CS 146", "test6", "class6"),
            new Item2("CS 116", "test7", "class7"),
            new Item2("", "test5", "class5")
    };

    private Item2(String name, String description, String prerequisite) {
        this.name = name;
        this.description = description;
        this.prerequisite = prerequisite;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public int getLength() { return items.length; }

}
