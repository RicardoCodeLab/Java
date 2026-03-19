package Map;
import java.util.HashMap;
import java.util.Map;
public class HashMap {
    public static void main(String[] args) {
        Map<Integer,String> nombreMap = new HashMap<>();
        nombreMap.put(76124578, "Ricardo Alonso Temoche Soriano");
        nombreMap.put(41438975, "Lady Adriana Soriano Veliz");
        nombreMap.put(67865412, "Kiara Melissa Temoche Soriano");
        nombreMap.put(12231224, "Veronica Isabel Vera Pacherre");
        
        System.out.println(nombreMap.size());
        System.out.println(nombreMap.isEmpty());
        System.out.println(nombreMap.containsValue("Ricardo Alonso Temoche Soriano"));
        System.out.println(nombreMap.containsKey(76124578));
        System.out.println(nombreMap.values());
        System.out.println(nombreMap.keySet());
    }
}
