package V1;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AccountTest {

    @Test
    public void should_account_balance_0() {
        Account account = new Account(30069098,"Neth");
        double r = account.getAccountBalance();
        assertThat(r,is(0.0));

    }


}