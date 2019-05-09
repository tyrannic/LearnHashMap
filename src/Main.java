import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
       /* Solution solution=new Solution();
        String s="ababcd";
        System.out.println(solution.lengthOfLongestSubstring(s));
*/

       //put方法，已经有的返回key以前的值，否则null
        HashMap<String,Integer> map=new HashMap<>();
        System.out.println(map.put("1",1));
        System.out.println(map.put("1",2));
        //get
        System.out.println(map.get("1"));
        System.out.println(map.get("demo"));
        //isEmpty
        System.out.println(map.isEmpty());
        //containsKey/containsValue
        System.out.println(map.containsKey("1"));
        System.out.println(map.containsKey("demo"));
        //删除key下的value
        System.out.println(map.remove("1"));//返回删除前的值，这里也就是2
        System.out.println(map.get("1"));
        System.out.println(map.remove("demo"));//这里返回null
        System.out.println(map);
        map.put("hello",1);
        System.out.println(map);
        map.remove("hello",1);
        System.out.println(map);
        //map.values
        map.put("demo1",1);
        map.put("demo2",2);
        System.out.println(map.values());//返回[1,2]
        //map.keyset
        System.out.println(map.keySet());//[demo1，demo2]返回key
        //map.entryseet
        System.out.println(map.entrySet());//返回[demo1=1,demo2=2]
        //putAll
        HashMap<String,Integer> map1=new HashMap<>();
        map1.putAll(map);
        System.out.println(map1.entrySet());
    }
}
