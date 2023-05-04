package ChapterSixteen.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        Map<String, String[]> nigerianStates = new HashMap<>();
        nigerianStates.put("Zamfara", new String[]{"Akure", "Gusau"});
        nigerianStates.put("Sokoto", new String[]{"Sokoto", "Gusau"});
        nigerianStates.put("Taraba", new String[]{"Gembu", "Jalingo municipal"});
        nigerianStates.put("Akwa-ibom", new String[]{"ikot-ekpene", "ikono"});

        var set = nigerianStates.entrySet();
        set.forEach(e-> System.out.println(e.getKey()+" : "+ Arrays.toString(e.getValue())));


        }

//        System.out.println("map --> "+nigerianStates);
//
//        nigerianStates.keySet().forEach( k-> System.out.print(k + Arrays.toString(nigerianStates.get(k))+"\n"));
//
//        String[] value = nigerianStates.get("Taraba");
//        System.out.println(Arrays.toString(value));
    }
