public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1;
        int j = n - 1;
        int cur = m + n - 1;
        while(i > -1 && j > -1){
            if(A[i] > B[j]){
                A[cur] = A[i];
                i--;
            }
            else{
                A[cur] = B[j];
                j--;
            }
            cur--;
        }
        if(i == -1){
            while(j > -1){
                A[cur] = B[j];
                cur--;
                j--;
            }
        }
    }
}