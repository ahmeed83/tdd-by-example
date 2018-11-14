package guru.springframework;

public class Dollar extends Money{

    public Dollar(final int amount) {
        this.amount = amount;
    }

    public Money times(final int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
