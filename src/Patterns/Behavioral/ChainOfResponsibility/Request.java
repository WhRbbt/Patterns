package Patterns.Behavioral.ChainOfResponsibility;

public class Request {
    private int budget;
    private String destinationType;
    private boolean insuranceRequired;

    public Request(int budget, String destinationType, boolean insuranceRequired) {
        this.budget = budget;
        this.destinationType = destinationType;
        this.insuranceRequired = insuranceRequired;
    }

    public int getBudget() {
        return budget;
    }

    public String getDestinationType() {
        return destinationType;
    }

    public boolean isInsuranceRequired() {
        return insuranceRequired;
    }
}