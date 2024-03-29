package pl.akademiaspecjalistowit.streamapiinpractice.zadanie1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Dokonaj sumy wszystkich liczb parzystych większych od 10
 */
public class Zadanie1 {

    @Test
    void filteringAndSumming() {
        //given
        List<Integer> numbers = Arrays.asList(12, 3, 45, 19, 8, 15, 4, 27, 20);

        int sum = sumEvenGraterThanTen(numbers);

        assertThat(sum).isEqualTo(32);
    }

    private int sumEvenGraterThanTen(List<Integer> numbers) {
        return 0;
    }
}
