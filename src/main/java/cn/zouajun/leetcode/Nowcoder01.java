package cn.zouajun.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//255.255.255.0
//192.168.224.256
//192.168.10.4
//255.0.0.0
//193.194.202.15
//232.43.7.59
//255.255.255.0
//192.168.0.254
//192.168.0.1

public class Nowcoder01 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        List<Integer> res = new ArrayList();
        Nowcoder01 m = new Nowcoder01();

        while(in.hasNext()){
            String sub = in.nextLine();
            if(sub.equals("exit")){
                break;
            }
            String ip1 = in.nextLine();
            String ip2 = in.nextLine();

            res.add(m.isSubNet(ip1,ip2,sub));
        }

        for(int i = 0;i<res.size();i++){
            System.out.println(res.get(i));
        }




    }

    public int isSubNet(String ip1,String ip2,String sub){

        String[] ip1s = ip1.split(".");
        String[] ip2s = ip2.split(".");
        String[] subs = sub.split(".");

        if(ip1s.length != 4 || ip2s.length != 4 || subs.length != 4){
            return 1;
        }

        for(int i = 0;i< 4;i++){

            if(Integer.parseInt(ip1s[i]) > 255 || Integer.parseInt(ip1s[i]) < 0){
                return 1;
            }

            if(Integer.parseInt(ip2s[i]) > 255 || Integer.parseInt(ip2s[i]) < 0){
                return 1;
            }

            if(Integer.parseInt(subs[i]) > 255 || Integer.parseInt(subs[i]) < 0){
                return 1;
            }
        }

        if((Integer.parseInt(ip1s[0]) & Integer.parseInt(subs[0])) == (Integer.parseInt(ip2s[0]) & Integer.parseInt(subs[0])) &&
                (Integer.parseInt(ip1s[1]) & Integer.parseInt(subs[1])) == (Integer.parseInt(ip2s[1]) & Integer.parseInt(subs[1])) &&
                (Integer.parseInt(ip1s[2]) & Integer.parseInt(subs[2])) == (Integer.parseInt(ip2s[2]) & Integer.parseInt(subs[2])) &&
                (Integer.parseInt(ip1s[3]) & Integer.parseInt(subs[3])) == (Integer.parseInt(ip2s[3]) & Integer.parseInt(subs[3]))){

            return 0;
        } else {

            return 2;
        }
    }



}
