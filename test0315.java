/*
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 
示例 1:
输入: "abab"
输出: True
解释: 可由子字符串 "ab" 重复两次构成。

示例 2:
输入: "aba"
输出: False

示例 3:
输入: "abcabcabcabc"
输出: True
解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
*/
package lianxi0315;

public class test0315 {
	public static void main(String[] args) {
		Solution S = new Solution();
		String s = "abababab";
		boolean a = S.repeatedSubstringPattern(s);
		System.out.println(a);
	}
}

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        int i = 1;
        while (i < s.length()) {
            if (s.length() % i == 0) {
            	//字符串的总长度必须是偶数，
                String temp = s.substring(0, i);//每次用前i位字符为一个整体来与后面每隔i个来比较
                int j = i, k = j + i;
                while (k <= s.length()) {
                    if (!s.substring(j, k).equals(temp)) {//
                        break;
                    }
                    //每次加i位
                    j += i;
                    k += i;
                }
                if (k > s.length()) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}
