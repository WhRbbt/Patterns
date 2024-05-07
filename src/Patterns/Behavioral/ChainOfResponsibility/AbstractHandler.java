package Patterns.Behavioral.ChainOfResponsibility;

public abstract class AbstractHandler implements Handler {
    private Handler nextHandler;

    public AbstractHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}