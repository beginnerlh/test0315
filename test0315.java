/*
 * ����һ���ǿյ��ַ������ж����Ƿ����������һ���Ӵ��ظ���ι��ɡ��������ַ���ֻ����СдӢ����ĸ�����ҳ��Ȳ�����10000��
 
ʾ�� 1:
����: "abab"
���: True
����: �������ַ��� "ab" �ظ����ι��ɡ�

ʾ�� 2:
����: "aba"
���: False

ʾ�� 3:
����: "abcabcabcabc"
���: True
����: �������ַ��� "abc" �ظ��Ĵι��ɡ� (�������ַ��� "abcabc" �ظ����ι��ɡ�)
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
            	//�ַ������ܳ��ȱ�����ż����
                String temp = s.substring(0, i);//ÿ����ǰiλ�ַ�Ϊһ�������������ÿ��i�����Ƚ�
                int j = i, k = j + i;
                while (k <= s.length()) {
                    if (!s.substring(j, k).equals(temp)) {//
                        break;
                    }
                    //ÿ�μ�iλ
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
