/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        int result = 0;
        double k = 0;
        if(points.length > 0){
            result = 1;
        }
        for(int i = 0; i < points.length - 1; i++){
            int sameP = 0;
            int verticalL = 0;
            for(int j = i + 1; j < points.length; j++){
                if(points[i].x == points[j].x){
                    if(points[i].y == points[j].y){
                        sameP++;
                    }
                    else{
                        verticalL++;
                    }
                    continue;
                }
                if(points[i].y == points[j].y){
                    k = 0.0;
                }
                else{
                    k = 1.0 * ( points[i].y - points[j].y ) / ( points[i].x - points[j].x );
                }
                if(map.containsKey(k)){
                    map.put( k , map.get(k) + 1);
                }
                else{
                    map.put( k , 2 );
                }
            }
            for(int count : map.values()){
                if( count + sameP > result){
                    result = count + sameP;
                }
            }
            if(sameP + verticalL + 1 > result){
                result = sameP + verticalL + 1;
            }
            map.clear();
        }
        return result;
    }
}