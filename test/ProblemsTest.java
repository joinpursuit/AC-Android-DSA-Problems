import nyc.c4q.Problems;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProblemsTest {

    /////////// selectEvenNumber tests

    @Test
    public void selectEvenNumber_empty_array_returns_empty() {
        int[] input = new int[]{};
        assertArrayEquals(new int[]{}, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_single_even_number_returns_all() {

    }

    @Test
    public void selectEvenNumber_single_odd_number_returns_nothing() {

    }

    @Test
    public void selectEvenNumber_all_even_numbers_returns_all() {

    }

    @Test
    public void selectEvenNumber_duplicate_even_numbers_returns_all() {

    }

    @Test
    public void selectEvenNumber_zero_is_returned() {

    }

    @Test
    public void selectEvenNumber_negative_is_not_returned() {

    }

    @Test
    public void selectEvenNumber_ordering_is_preserved() {

    }

    @Test
    public void selectEvenNumber_null_input_returns_empty() {

    }


    /////////
}
