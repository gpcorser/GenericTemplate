package com.example.gpcorser.bitsandpizzas;

/**
 * Created by gpcorser on 11/7/2016.
 */

public class Item {
    private String name;
    private int imageResourceId;

    public static final Item[] pizzas = {
            new Item("Diavolo", R.drawable.diavolo),
            new Item("Funghi", R.drawable.funghi),
            new Item("Salad", R.drawable.salad)
    };

    private Item(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
