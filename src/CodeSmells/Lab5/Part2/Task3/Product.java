package CodeSmells.Lab5.Part2.Task3;

public class Product {
    private String name;
    private double price;
    private Currency currency;

    public Product(String name, double price, String currencyCode) {
        this.name = name;
        this.price = price;
        this.currency = Currency.getInstance(currencyCode);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrencyCode() {
        return currency.getCode();
    }
}