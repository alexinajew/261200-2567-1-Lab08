import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.awt.Color;

public class ExampleTreeMap {
    public static void main(String[] args) {
        Map<String, Color> favoriteColors = new TreeMap<>();
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.BLUE);
        favoriteColors.put("Robert", Color.BLACK);
        favoriteColors.put("Mary", Color.WHITE);
        favoriteColors.put("Pedro", Color.YELLOW);
        favoriteColors.put("Cole", Color.BLUE);

        // Print all keys and values in the map
        Set<String> keySet = favoriteColors.keySet();
        for (String key : keySet) {
            Color value = favoriteColors.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
