

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class IntsCalculatorTest {
    protected IntsCalculator sut = new IntsCalculator();

    @BeforeEach
    public void beforeEach() {
        sut = new IntsCalculator();
    }

    @AfterEach
    public void afterEach() {
        sut = null;
    }

    @Test
    void sum() {
        int a = 2;
        int b = 3;
        int expected = 5;

        assertThat(sut.sum(a, b), equalTo(expected));
    }

    @Test
    void mult() {
        int a = 3;
        int b = 4;
        int expected = 12;

        assertThat(sut.mult(a, b), equalTo(expected));
    }

    @Test
    void pow() {
        int a = 4;
        int b = 5;
        int expected = 1024;

        assertThat(sut.pow(a, b), equalTo(expected));
    }
}