package CodeSmells.Lab5.Part2.Task13;

public abstract class Product {
    private String name;

    Product(String name) {
        this.name = name;
    }

    public static Product createProduct(int typeCode, String name) {
        switch (typeCode) {
            case 1:
                return new ProductType1(name);
            case 2:
                return new ProductType2(name);
            default:
                return new DefaultProduct(name);
        }
    }

    public abstract void process();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}