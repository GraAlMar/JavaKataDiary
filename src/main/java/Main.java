import BackspacesInString.BackspacesInString;
import Kata_Int32_to_IPv4.Kata_Int32_to_IPv4;

public class Main {
    public static void main(String[] args) {
        BackspacesInString solution = new BackspacesInString();

        /*System.out.println(solution.cleanString("abc#d##c"));
        System.out.println(solution.cleanString("abc##d######"));
        System.out.println(solution.cleanString("#######"));
        System.out.println(solution.cleanString(""));*/

        Kata_Int32_to_IPv4 int32_to_iPv4 = new Kata_Int32_to_IPv4();
        System.out.println(int32_to_iPv4.longToIP(2149583361L));
    }

}
