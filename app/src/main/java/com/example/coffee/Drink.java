package com.example.coffee;

public class Drink {
    private String name;
    private String des;

    public static final Drink[] drinks = {
            new Drink("Latte", "espresso and steamed milk"),
            new Drink("Cappuccino", "espresso, hot milk, and steamed milk foam"),
            new Drink("Filter", "High quality beans roasted and brewed fresh"),
    };

    private Drink(String name, String description){
        this.name = name;
        this.des = description;

    }
    public String getName(){return name;}
    public String getDescription(){return des;}


    @Override
    public String toString(){return name;}

    public int getImageID() {
        return 0;
    }
}



