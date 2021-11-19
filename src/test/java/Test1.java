import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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



}
