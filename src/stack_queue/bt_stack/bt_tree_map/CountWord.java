package stack_queue.bt_stack.bt_tree_map;

import java.util.Set;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        String str = "Tran Dai Thien Thien. C0522K1, Razt, Codegym Hue";
        str.replace ( ",", "" );
        str.replace ( ".", "" );
        String[] array = str.split ( "" );
        String key = "";
        int value;
        TreeMap<String, Integer> map = new TreeMap<> ();
        for (String s : array) {
            key = s.toLowerCase ();
            if ( map.containsKey ( key ) ) {
                value = map.get ( key );
                map.remove ( key );
                map.put ( key, value + 1 );
            } else {
                map.put ( key, 1 );
            }
        }
        Object o = new Object ();
        Set<String> set = map.keySet ();
        for (String s : set) {
            key = s;
            System.out.println ( key + " show "
                    + map.get ( key ) + " time. " );
        }
    }
}
