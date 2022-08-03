package pl.dolega;

import org.junit.Test;
import pl.dolega.kata._6kyu.Order;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    @Test
    public void test() {
        assertEquals(
                "Fo1r the2 g3ood 4of th5e pe6ople",
                Order.order("4of Fo1r pe6ople g3ood th5e the2")
        );
    }
}
