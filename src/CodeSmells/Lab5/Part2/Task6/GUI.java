package CodeSmells.Lab5.Part2.Task6;

public class GUI implements Observer {
    private String customerName;
    private String productName;
    private int quantity;

    private Order domain;

    public GUI() {
        this.domain = new Order();
        domain.registerObserver(this);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
        domain.setCustomerName(customerName);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
        domain.setProductName(productName);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        domain.setQuantity(quantity);
    }

    @Override
    public void update() {
        this.customerName = domain.getCustomerName();
        this.productName = domain.getProductName();
        this.quantity = domain.getQuantity();
    }

    public void onCustomerNameChanged(String newName) {
        setCustomerName(newName);
    }

    public void onProductNameChanged(String newName) {
        setProductName(newName);
    }

    public void onQuantityChanged(int newQuantity) {
        setQuantity(newQuantity);
    }
}
