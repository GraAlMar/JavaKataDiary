package Kata_Int32_to_IPv4;

public class Kata_Int32_to_IPv4 {
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
