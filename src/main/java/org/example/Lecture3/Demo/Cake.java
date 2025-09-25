package org.example.Lecture3.Demo;

public class Cake {
    public Cake(){}

    public Cake(String flavour, String color, boolean isDecorated, long sliceNumber, int layerNumbers){
        this.flavour = flavour;
        this.color = color;
        this.isDecorated = isDecorated;
        this.sliceNumber = sliceNumber;
        this.layerNumbers = layerNumbers;
    }



    public Cake(String flavour, String color, boolean isDecorated, long sliceNumber){
        this(flavour, color, isDecorated, sliceNumber, 4);
    }

    public Cake(String flavour, String color, boolean isDecorated, int number){
        this(flavour, color, isDecorated, number, number);
    }

    public Cake(String flavour, String color, boolean isDecorated, short layerNumbers){
        this(flavour, color, isDecorated, 15, layerNumbers);
    }

    public Cake(int sliceNumber){
        //this.sliceNumber = sliceNumber;
        this(sliceNumber, 3);
    }

    public Cake(String flavour){
        addFlavour(flavour);
    }

    public Cake(int sliceNumber, int layerNumbers){
        this.sliceNumber = sliceNumber;
        this.layerNumbers = layerNumbers;
    }

    static String flavour = "vanilla";
    String color;
    boolean isDecorated = false;
    long sliceNumber;
    int layerNumbers = 2;

    public void addFlavour(String flavour){
        this.flavour = this.flavour + " and " + flavour;
    }

    public String removeFlavour(String flavour){
        //additional homework, how to do it.
        return this.flavour;
    }
}
