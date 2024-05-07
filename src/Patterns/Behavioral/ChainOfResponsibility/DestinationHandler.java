package Patterns.Behavioral.ChainOfResponsibility;

public class DestinationHandler extends AbstractHandler {
    public DestinationHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if ("beach".equals(request.getDestinationType())) {
            System.out.println("DestinationHandler: Beach destination approved");
        } else {
            System.out.println("DestinationHandler: Unknown destination");
        }
        super.handleRequest(request);
    }
}