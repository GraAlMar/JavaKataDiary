package BackspacesInString;

public class BackspacesInString {

        public String cleanString(String s) {
            StringBuilder result = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (c != '#') {
                    result.append(c);
                } else if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            }

            return result.toString();
        }



}
