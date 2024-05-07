package Patterns.Behavioral.ChainOfResponsibility;

public class BudgetHandler extends AbstractHandler {
    public BudgetHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getBudget() > 1000) {
            System.out.println("BudgetHandler: This budget is enough for international travel");
        } else {
            System.out.println("BudgetHandler: This budget is enough for local trips");
        }
        super.handleRequest(request);
    }
}