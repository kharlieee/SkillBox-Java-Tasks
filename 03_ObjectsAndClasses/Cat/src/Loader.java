import java.awt.*;

public class Loader {
    public static void main(String[] args) {
        //Cat number 1
        Cat william = new Cat();
        System.out.println("William weight: " + william.getWeight());
        william.meow();
        System.out.println("William weight after feed: " + william.getWeight());
        System.out.println("William status: " + william.getStatus());

        //Cat number 2
        Cat oliver = new Cat();
        System.out.println("oliver weight: " + oliver.getWeight());
        oliver.feed(100.0);
        System.out.println("Oliver weight after feed: " + oliver.getWeight());
        System.out.println("Oliver status: " + oliver.getStatus());

        //Cat number 3
        Cat amelia = new Cat();
        System.out.println("Amelia weight: " + amelia.getWeight());
        System.out.println("Amelia status: " + amelia.getStatus());
        while (!amelia.getStatus().equals("Exploded"))
        {
            amelia.feed(230.0);
        }
        amelia.weightFood();
        System.out.println("Amelia weight: " + amelia.getWeight());
        System.out.println("Amelia status: " + amelia.getStatus());

        //Cat number 4
        Cat alexander = new Cat();
        System.out.println("Alexander weight: " + alexander.getWeight());
        System.out.println("Alexander status: " + alexander.getStatus());
        while (!alexander.getStatus().equals("Dead"))
        {
            alexander.meow();
        }
        System.out.println("Alexander weight: " + alexander.getWeight());
        System.out.println("Alexander status: " + alexander.getStatus());

        //Cat number 5
        Cat james = new Cat();
        System.out.println("James weight: " + james.getWeight());
        while (!james.getStatus().equals("Sleeping"))
        {
            james.feed(33.0);
            james.drink(17.0);
            System.out.println("James drink and eat...");
        }
        System.out.println("James weight: " + james.getWeight());
        System.out.println("James status: " + james.getStatus());

        //Cat number 6
        Cat benjamin = new Cat();
        System.out.println("Benjamin weight: " + benjamin.getWeight());
        benjamin.feed(150.0);
        System.out.println("Benjamin weight: " + benjamin.getWeight());
        System.out.println("Benjamin status: " + benjamin.getStatus());
        benjamin.poop();
        benjamin.poop();
        benjamin.poop();
        benjamin.weightFood();
        System.out.println("Benjamin weight: " + benjamin.getWeight());
        System.out.println("Benjamin status: " + benjamin.getStatus());


        //Cat number 7
        Cat alice = new Cat();
        System.out.println("Alice weight: " + alice.getWeight());

        //Cats count output
        System.out.println("Alive cats count: " + Cat.getCatsCount());

        //Using a color setter and getter
        Cat john = new Cat();
        john.setColor(Color.WHITE);
        System.out.println("John's color: " + john.getColor());
        System.out.println("John's weight: " + john.getWeight());

        //Create a copy
        Cat merlin = new Cat(john);
        System.out.println("Merlin's color: " + merlin.getColor());
        System.out.println("Merlin's weight: " + merlin.getWeight());
    }

    private static Cat getKitten() {
        Cat Jhoosef = new Cat(1100.0);
        return Jhoosef;
    }
}