package Patterns.Structural.Adapter;

public class CurrencyAdapter implements CurrencyInterface {
    private EuroCurrency euroCurrency;

    public CurrencyAdapter(EuroCurrency euroCurrency) {
        this.euroCurrency = euroCurrency;
    }

    @Override
    public double getCurrencyInUSD() {
        return eurosToUSD(euroCurrency.getEuros());
    }

    @Override
    public void setCurrencyInUSD(double amountInUSD) {
        euroCurrency.setEuros(usdToEuros(amountInUSD));
    }

    private double eurosToUSD(double euros) {
        return euros * 1.0773;
    }

    private double usdToEuros(double usd) {
        return usd / 1.0773;
    }
}