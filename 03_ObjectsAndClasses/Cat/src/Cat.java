public class Cat {
    private double originWeight;
    private double weight;
    private double weightFood;
    private double minWeight;
    private double maxWeight;
    private static int catsCount;
    private static boolean isCatAlive;
    private static final int MIN_WEIGHT = 1000;
    private static final int MAX_WEIGHT = 9000;
    public static final int LEGS_COUNT = 4;
    public static final int CAT_QTY_EYES = 2;
    public static final int CAT_MIN_WEIGHT = 1200;
    public static final int CAT_MAX_WEIGHT = 7500;
    private String name;
    private Color color;

    public Cat() {
        catsCount++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        isCatAlive = true;
    }

    public Cat(double weight) {
        this();
        this.weight = weight;
        originWeight = weight;
    }

    public Cat(Cat other) {
        this();
        this.color = other.color;
        this.weight = other.weight;
        originWeight = weight;
    }

    public Cat(String name) {
        this();
        this.name = name;
    }

    public void poop() {
        if (isCatAlive) {
            weight = -50;
            System.out.println("Pooped.");
        } else {
            System.out.println("Dead cat can't poop.");
        }
        if (weight < minWeight && isCatAlive) {
            catsCount--;
            isCatAlive = false;
        }
    }

    public void meow() {
        if (isCatAlive) {
            weight = --weight;
            System.out.println("Meow.");

        }
        else
        {
            System.out.println("Dead cat can't make meow.");
        }
        if (weight < minWeight && isCatAlive)
        {
            catsCount--;
            isCatAlive = false;
        }
    }

    public void feed(Double amount) {
        if (isCatAlive)
        {
            weight += amount;
            weightFood += amount;
            System.out.println("Feed: " + amount);

        }
        else
        {
            System.out.println("Dead cat can't eat.");
        }
        if (weight > maxWeight && isCatAlive) {
            isCatAlive = false;
            catsCount--;
        }
    }

    public void drink(Double amount) {
        if (isCatAlive) {
            weight += amount;
        }
        else
        {
            System.out.println("Dead cat can't drink");
        }
        if (weight > maxWeight && isCatAlive)
        {
            catsCount--;
            isCatAlive = false;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void weightFood() {
        System.out.println("Eating food: " + weightFood);
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT)
        {
            catsCount--;
            return "Dead";
        }
        else if (weight > MAX_WEIGHT)
        {
            catsCount--;
            return "Exploded";
        }
        else if (weight > originWeight)
        {
            return "Sleeping";
        }
        else
        {
            return "Playing";
        }
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public static int getCatsCount() {
        System.out.println("Cats count: ");
        return catsCount;
    }

    public Color getColor() {
        return color;
    }
}