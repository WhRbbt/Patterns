package CodeSmells.Lab5.Part3.Task7;

public class NullAddress extends Address {
    public NullAddress() {
        super("", "");
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getStreet() {
        return "No Street";
    }

    @Override
    public String getCity() {
        return "No City";
    }
}
