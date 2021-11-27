package cn.zouajun.leetcode;

import java.util.*;

public class Nowcodre03 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Nowcodre03 m = new Nowcodre03();

        List<String> list = new LinkedList();
        Map<String,Integer> map = new HashMap();

        while(sc.hasNext()){

            String str = sc.nextLine();
            String str_t = m.getErr(str);

            if(map.containsKey(str_t)){
                //map.put(str_t,map.get(str_t) + 1);
                int tm = map.get(str_t);
                String key = str_t + " " + tm;
                map.put(str_t,tm+1);

                for(int i = 0;i<list.size() ;i++){
                    if(list.get(i).equals(key)){
                        list.remove(i);
                        //System.out.println("log:" + str_t);
                        list.add(i,str_t + " " + (tm+1));
                    }
                }

            }else {
                map.put(str_t,1);
                list.add(str_t + " 1");
            }

        }

        int j = list.size()>=8 ? list.size()-8 :0;

        for(int i = j;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }


    public String getErr(String str){

        String[] strs = str.split(" ");

        int inx = strs[0].lastIndexOf("\\");

        String subStr = strs[0].substring(inx + 1 , strs[0].length());

        subStr = subStr.length() > 16?subStr.substring(subStr.length()-16,subStr.length()):subStr;

        return  subStr + " " + strs[1];
    }

}
