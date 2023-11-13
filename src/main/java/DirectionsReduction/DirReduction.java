package DirectionsReduction;

import java.util.*;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        final List<String> directions = new ArrayList<>(Arrays.asList(arr));
        final Map<String, String> dirPairs = new HashMap<>();
        dirPairs.put("NORTH","SOUTH");
        dirPairs.put("SOUTH","NORTH");
        dirPairs.put("EAST","WEST");
        dirPairs.put("WEST","EAST");
        boolean done;

        do {
            done = true;
            for (int i = 0; i < directions.size() - 1; i ++) {
                if (directions.get(i + 1).equals(dirPairs.get(directions.get(i)))) {
                    directions.remove(i + 1);
                    directions.remove(i);
                    done = false;
                    break;
                }
            }
        } while (!done);
        return directions.toArray(new String[0]);
    }
}
