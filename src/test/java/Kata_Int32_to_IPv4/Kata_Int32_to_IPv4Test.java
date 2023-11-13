package Kata_Int32_to_IPv4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Kata_Int32_to_IPv4Test {

//    @Test
    @ParameterizedTest
    @CsvSource({
            "2149583361, 128.32.10.1",
            "32, 0.0.0.32",
            "0, 0.0.0.0"
    })
    void testLongToIP(long input, String expected) {
        assertEquals(expected, longToIP(input));
    }

    public static String longToIP(long ip) {
        // Java doesn't have uint32, so here we use long to represent int32
        StringBuilder sb = new StringBuilder();
        sb.append((ip >> 24) & 0xFF).append('.');
        sb.append((ip >> 16) & 0xFF).append('.');
        sb.append((ip >> 8) & 0xFF).append('.');
        sb.append(ip & 0xFF);
        return sb.toString();
    }
}