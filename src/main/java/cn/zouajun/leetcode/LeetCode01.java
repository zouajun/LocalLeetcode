package cn.zouajun.leetcode;

public class LeetCode01 {


//    将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
//
//    比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
//
//    P   A   H   N
//    A P L S I I G
//    Y   I   R
//    之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
//
//    请你实现这个将字符串进行指定行数变换的函数：
//
//    string convert(string s, int numRows);
//
//
//    示例 1：
//
//    输入：s = "PAYPALISHIRING", numRows = 3
//    输出："PAHNAPLSIIGYIR"
//    示例 2：
//    输入：s = "PAYPALISHIRING", numRows = 4
//    输出："PINALSIGYAHRPI"
//    解释：
//    P     I    N
//    A   L S  I G
//    Y A   H R
//    P     I
//    示例 3：
//
//    输入：s = "A", numRows = 1
//    输出："A"
//             
//
//    提示：
//
//            1 <= s.length <= 1000
//            s 由英文字母（小写和大写）、',' 和 '.' 组成
//            1 <= numRows <= 1000


    public static void main(String[] args) {

        String s = "ABC";
        int numRow = 1;

        LeetCode01 leetCode01 = new LeetCode01();
        System.out.println(leetCode01.convert(s, numRow));

    }


    public String convert(String s, int numRows){

        if(numRows == 1){
            return s;
        }

        char[] char_s = new char[s.length()];
        s.getChars(0,s.length(),char_s,0);

        char[][] map = new char[numRows][s.length()];

        int j = 0;//行
        int k = 0;//列
        int fx = 0;//0下，1上

        for (int i = 0; i < s.length(); i++) {

            map[j][k] = char_s[i];

            if(fx == 0 && j >= numRows -1){
                fx = 1;
            }else if(fx == 1 && j <= 0){
                fx = 0;
            }

            if(fx == 0){
                j++;
            }

            if(fx == 1) {
                j = j-1 <0 ? 0:j-1;
                k++;
            }
        }

        StringBuffer sb = new StringBuffer();
        for (j = 0; j < numRows; j++) {
            for (k = 0; k < s.length() ; k++){
                if (map[j][k] != '\u0000'){
                    sb.append(map[j][k]);
                }
            }
        }


        return sb.toString();
    }


}
