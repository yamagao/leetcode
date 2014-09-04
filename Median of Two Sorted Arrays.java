public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int a = A.length;
        int b = B.length;
        int m = ((a + b) % 2) == 1 ? (a + b) / 2 : (a + b) / 2 - 1;
        int i = 0;
        int j = 0;
        int first = 0;
        int second = 0;
        while(m > -1){
            if(i < a && j < b){
                if(A[i] < B[j]){
                    first = A[i];
                    i++;
                }
                else{
                    first = B[j];
                    j++;
                }
                m--;
            }
            else{
                break;
            }
        }
        if(((a + b) % 2) == 1){
            if(i == a){
                return m == -1 ? first * 1.0 : B[j + m];
            }
            if(j == b){
                return m == -1 ? first * 1.0 : A[i + m];
            }
            return first * 1.0;
        }
        else{
            if(i == a){
                first = m == -1 ? first : B[j + m];
                second = m == -1 ? B[j] : B[j + m + 1];
                return (first + second) / 2.0;
            }
            if(j == b){
                first = m == -1 ? first : A[i + m];
                second = m == -1 ? A[i] : A[i + m + 1];
                return (first + second) / 2.0;
            }
            second = A[i] < B[j] ? A[i] : B[j];
            return (first + second) / 2.0;
        }
    }
}