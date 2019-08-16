package tddlession.money;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DollarTest {
    @Test
    public void testMultiplication(){
        Dollar dollar = new Dollar(5);
        dollar.time(2);
        Assertions.assertEquals(10, dollar.amount);
    }
}
