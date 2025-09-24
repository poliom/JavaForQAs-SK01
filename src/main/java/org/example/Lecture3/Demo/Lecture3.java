package org.example.Lecture3.Demo;

public class Lecture3 {
    public static void main(String[] args) {
        Cake vanillaCake = new Cake();
        System.out.println("My vanila cake: " + vanillaCake);
        System.out.println("My cake flavour is: " + vanillaCake.flavour);
        System.out.println("My cake color is: " + vanillaCake.color);
        System.out.println("My cake isDecorated is: " + vanillaCake.isDecorated);
        System.out.println("My cake sliceNumber is: " + vanillaCake.sliceNumber);
        System.out.println("My cake layerNumbers is: " + vanillaCake.layerNumbers);

        System.out.println("---------------------------");

        vanillaCake.color = "Red";
        vanillaCake.sliceNumber = 9;
        vanillaCake.isDecorated = true;

        System.out.println("My cake flavour is: " + vanillaCake.flavour);
        System.out.println("My cake color is: " + vanillaCake.color);
        System.out.println("My cake isDecorated is: " + vanillaCake.isDecorated);
        System.out.println("My cake sliceNumber is: " + vanillaCake.sliceNumber);
        System.out.println("My cake layerNumbers is: " + vanillaCake.layerNumbers);

        System.out.println("---------------------------");

        vanillaCake.addFlavour("Chocolate");

        System.out.println("My cake flavour is: " + vanillaCake.flavour);
        System.out.println("My cake color is: " + vanillaCake.color);
        System.out.println("My cake isDecorated is: " + vanillaCake.isDecorated);
        System.out.println("My cake sliceNumber is: " + vanillaCake.sliceNumber);
        System.out.println("My cake layerNumbers is: " + vanillaCake.layerNumbers);

        System.out.println("---------------------------");
        System.out.println("Vanilla cake with Peanuts only:");
        Cake customFlavourCake = new Cake("Peanuts");

        System.out.println("My custom cake flavour is: " + customFlavourCake.flavour);
        System.out.println("My custom cake color is: " + customFlavourCake.color);
        System.out.println("My custom cake isDecorated is: " + customFlavourCake.isDecorated);
        System.out.println("My custom cake sliceNumber is: " + customFlavourCake.sliceNumber);
        System.out.println("My custom cake layerNumbers is: " + customFlavourCake.layerNumbers);

        customFlavourCake.addFlavour("Chocolate");
        System.out.println("My custom cake flavour is: " + customFlavourCake.flavour);

        System.out.println("---------------------------");
        System.out.println("Another vanilla cake:");
        Cake customSlicesCake = new Cake(6);

        System.out.println("My custom slices cake flavour is: " + customSlicesCake.flavour);
        System.out.println("My custom slices cake color is: " + customSlicesCake.color);
        System.out.println("My custom slices cake isDecorated is: " + customSlicesCake.isDecorated);
        System.out.println("My custom slices cake sliceNumber is: " + customSlicesCake.sliceNumber);
        System.out.println("My custom slices cake layerNumbers is: " + customSlicesCake.layerNumbers);

        System.out.println("---------------------------");

        Cake customCake = new Cake(20,7);

        System.out.println("My custom End cake flavour is: " + customCake.flavour);
        System.out.println("My custom End cake color is: " + customCake.color);
        System.out.println("My custom End cake isDecorated is: " + customCake.isDecorated);
        System.out.println("My custom End cake sliceNumber is: " + customCake.sliceNumber);
        System.out.println("My custom End cake layerNumbers is: " + customCake.layerNumbers);

        System.out.println("---------------------------");

        Cake myEndGameCake = new Cake("Vanilla", "Blue", true, 90);

        System.out.println("My custom EndGame cake flavour is: " + myEndGameCake.flavour);
        System.out.println("My custom EndGame cake color is: " + myEndGameCake.color);
        System.out.println("My custom EndGame cake isDecorated is: " + myEndGameCake.isDecorated);
        System.out.println("My custom EndGame cake sliceNumber is: " + myEndGameCake.sliceNumber);
        System.out.println("My custom EndGame cake layerNumbers is: " + myEndGameCake.layerNumbers);
    }
}
