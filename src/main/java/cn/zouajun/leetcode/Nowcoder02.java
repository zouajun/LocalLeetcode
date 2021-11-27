package cn.zouajun.leetcode;

import java.util.*;

public class Nowcoder02 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Nowcoder02 m = new Nowcoder02();

        String in_str = in.nextLine();

        String[] strs = in_str.split(" ");

        int n = Integer.parseInt(strs[0]);
        String[] range = Arrays.copyOfRange(strs,1,n);
        String t = strs[strs.length -2];
        int k = Integer.parseInt(strs[strs.length -1]);

        Map<Character,Integer> t_map = m.getDict(t);
        List<String> broth_list = new ArrayList();

        for(int i = 0;i<range.length;i++){

            if(!range[i].equals(t) && t_map.equals(m.getDict(range[i]))){
                broth_list.add(range[i]);
            }

        }

        System.out.print(broth_list.size());
        if(broth_list.size() >= k){
            Collections.sort(broth_list);
            System.out.println(broth_list.get(k - 1));
        }





    }


    public Map<Character,Integer> getDict(String str){

        Map<Character,Integer> map = new HashMap();

        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else{
                map.put(c,1);
            }

        }

        return map;
    }

}
