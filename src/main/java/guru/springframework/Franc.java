package guru.springframework;

public class Franc extends Money {

    public Franc(final int amount) {
        this.amount = amount;
    }

    public Money times(final int multiplier) {
        return new Franc(amount * multiplier);
    }
}
