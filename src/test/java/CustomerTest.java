import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer(5, 1.90, 18);
    }

    @Test
    public void customerHasMoney(){
        assertEquals(5, customer.getMoney());
    }




}
