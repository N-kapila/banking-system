package V1;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DepositorTest {

    @Test
    public void should_increase_account_balance() {
        Depositor depositor = new Depositor(2000);
        double r = depositor.depositMoney(1000);
        assertThat(r,is(3000.0));
    }

}