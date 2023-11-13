package BackspacesInString;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


public class BackspacesInStringTest {
    @ParameterizedTest
    @CsvSource({
            "'', ''",
            "#######, ''",
            "a#b#c#d#, ''",
            "abcd#, abc",
            "abc#d##c, ac",
            "abc##d######, ''",


            "a#bc#d, bd",
            "abcd#####, ''",
            "#a#b#c#d#, ''",
            "abc#d###c#, ''"
    })
    public void testCleanString(String input, String expectedOutput) {
        BackspacesInString solution = new BackspacesInString();
        assertEquals(expectedOutput, solution.cleanString(input));
    }
}
