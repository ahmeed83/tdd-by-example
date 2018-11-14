package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar(){
        Money five =  Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void testEqualityDollar(){
        assertEquals(new Dollar(2), new Dollar(2));
        assertNotEquals(new Dollar(2), new Dollar(7));
        assertNotEquals(new Franc(2), new Dollar(2));
    }

    @Test
    void testMultiplicationFranc(){
        Money five =  Money.frank(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    void testEqualityFranc(){
        assertEquals(new Franc(2), new Franc(2));
        assertNotEquals(new Franc(2), new Franc(7));
    }
}
