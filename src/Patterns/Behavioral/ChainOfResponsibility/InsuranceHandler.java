package Patterns.Behavioral.ChainOfResponsibility;

public class InsuranceHandler extends AbstractHandler {
    public InsuranceHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.isInsuranceRequired()) {
            System.out.println("InsuranceHandler: Travel insurance ordered");
        }
        super.handleRequest(request);
    }
}