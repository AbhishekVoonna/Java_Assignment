import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sort_Key {
    static void Sort() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("3", "adithya");
        map.put("7", "rahul");
        map.put("2", "pavan");
        map.put("8", "mani");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Sort();

    }
}
