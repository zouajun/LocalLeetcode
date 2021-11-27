import org.junit.Test;

import java.util.*;

public class Test1 {

    @Test
    public void testString(){

        Set<List<Integer>> set = new HashSet<>();

        List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);

        List list2 = new ArrayList();
        list2.add(1);
        list2.add(3);

        set.add(list1);
        set.add(list2);

        System.out.println(set.size());

        List<List<Integer>> list = new ArrayList<>(set);

    }


    @Test
    public void testSplit(){
        String s = "0.0.0.0";
        String[] ss = s.split("[.]");


//        int a = 255;
//        int b = 245;
//
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));
//
        int a = 256;

        System.out.println((byte)a);

        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        map.put('a',2);
        map.put('c',2);

        map2.put('c',2);
        map2.put('a',2);

        System.out.println(map.equals(map2));

        String[] sss = {"1","2","3"};

        String[] ssss = Arrays.copyOfRange(sss,0,2);

        System.out.println(Arrays.toString(ssss));


    }

    @Test
    public void test02(){

        String str = "D:\\zwtymj\\xccb\\ljj\\cqzlyaszjvlsjmkwoqijggmybr 645";

//        String[] strs = str.split(" ");
//
//        int inx = strs[0].lastIndexOf("\\");
//
//        String subStr = strs[0].substring(inx + 1 ,strs[0].length());
//
//        System.out.println(subStr.length() > 16?subStr.substring(subStr.length()-16,subStr.length()):subStr);
//        System.out.println(strs[1]);
//        System.out.println(str.substring(0,str.lastIndexOf(" ")));
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");

//        System.out.println(linkedList.remove(1));
//        linkedList.add(1,"2");
        linkedList.remove(3);
        linkedList.add(0,"d");

        System.out.println(linkedList);

        linkedList.remove(0);
        System.out.println(linkedList);


    }



}
