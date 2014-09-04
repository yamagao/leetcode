public class Solution {
    public String reverseWords(String s) {
        int bcount = 0;
        int t = 0;
        int length = s.length();
        while(t < length){
        	if(s.charAt(t)==' '){
        		bcount++;
        	}
        	t++;
        }
		if(bcount == length){
            return "";
        }
        else{
            int count = 0;
            for(int i = 0; i < length-1; i++){
                if(s.charAt(i) == ' ' && s.charAt(i+1) == ' '){
                    count++;
                }
            }
            if(s.charAt(0) == ' '){
                count++;
            }
            if(s.charAt(length-1) == ' '){
                count++;
            }
            char[] rs = new char[length-count];
            int i = 0,j = 0;
            count = 0;
            int tmp;
            while(s.charAt(i) == ' '){
                i++;
                count++;
            }
            j = i;
            while(j < length){
                if(s.charAt(j)!=' '){
                    j++;
                }
                else{
                    tmp = j+1;
                    j--;
                    if(j-count+1 < rs.length){
                        rs[j-count+1] = ' ';
                    }
                    while(i<=j){
                        rs[i-count] = s.charAt(j);
                        rs[j-count] = s.charAt(i);
                        i++;
                        j--;
                    }
                    while(tmp < length && s.charAt(tmp)==' '){
                        tmp++;
                        count++;
                    }
                    i = tmp;
                    j = tmp;
                }
            }
            j--;
            while(i<=j){
                rs[i-count] = s.charAt(j);
                rs[j-count] = s.charAt(i);
                i++;
                j--;
            }
            i=0;j=rs.length-1;
            char sw;
            while(i<j){
                sw = rs[j];
                rs[j] = rs[i];
                rs[i] = sw;
                i++;
                j--;
            }
            return new String(rs);
        }
    }
}