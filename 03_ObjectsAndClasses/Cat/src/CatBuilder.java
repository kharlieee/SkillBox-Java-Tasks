public class CatBuilder {
    private String name;

    public CatBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Cat createCat() {
        return new Cat();
    }
}