package com.example.gpcorser.bitsandpizzas;

/**
 * Created by gpcorser on 11/7/2016.
 */

public class Item1 {
    private String name;
    private String description;
    private String prerequisite;

    public static final Item1[] items = {
            new Item1("MATH 103", "test1", "class1"),
            new Item1("COMM 105A", "Provides the student with " +
                    "basic theory and practice in person-to-person, " +
                    "small group, and public speaking communication " +
                    "processes. Examines characteristics of communicator " +
                    "behavior with communication in relationships as the " +
                    "basic model; message transmission/reception; effects of " +
                    "communication.", "None"),
            new Item1("MATH 120B", "In MATH 120B, students study equations and inequalities, " +
                    "functions, systems of equations, linear programming including the simplex " +
                    "method, quadratic functions, exponential and logarithmic functions, " +
                    "mathematics of finance, introductions to differential calculus including " +
                    "derivatives and applications. The course emphasizes applications from " +
                    "business and economics.", "MATH 103 or satisfactory score on math placement test."),
            new Item1("PHIL 205A (or 210B)", "test4", "class4"),
            new Item1("CS 105 (or CS 107A)", "test5", "class5"),
            new Item1("CS 146", "test6", "class6"),
            new Item1("CS 116", "test7", "class7"),
            new Item1("", "test5", "class5")
    };

    private Item1(String name, String description, String prerequisite) {
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
