package Patterns.Behavioral.ChainOfResponsibility;

public interface Handler {
    void handleRequest(Request request);
}