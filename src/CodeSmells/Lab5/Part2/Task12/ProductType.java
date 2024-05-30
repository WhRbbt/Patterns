package CodeSmells.Lab5.Part2.Task12;

public class ProductType {
    private int typeCode;

    private ProductType(int typeCode) {
        this.typeCode = typeCode;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public static ProductType TYPE1() {
        return new ProductType(1);
    }

    public static ProductType TYPE2() {
        return new ProductType(2);
    }

    public static ProductType TYPE3() {
        return new ProductType(3);
    }
}