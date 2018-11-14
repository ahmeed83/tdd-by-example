package guru.springframework;

import java.util.Objects;

public abstract class Money {
    protected int amount;

    public static Money dollar(final int amount) {
        return new Dollar(amount);
    }

    public static Money frank(final int amount) {
        return new Franc(amount);
    }

    public abstract Money times(final int i) ;

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
