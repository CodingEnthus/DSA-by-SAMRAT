class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[][] cars=new double[n][2];
        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(cars,(a,b)->Double.compare(b[0],a[0]));
        double prev=0;
        int count=0;
        for(double[] car:cars){
            if(car[1]>prev){
                count+=1;
                prev=car[1];
            }
        }
        return count;
    }
}

// car[n][2]

// [[10,1],[8,1],[0,12],[5,7][3,3]]

// Sorted Cars- [[10, 1], [8, 1], [5, 7], [3, 3], [0, 12] 
// prev=0;
// count=0;
// car[] in Cars
// car[1]>prev?
// 1>0 y C=1 p=1
// 1>1 n C=1 p=1
// 7>1 y C=2 p=7
// 3>7 n C=2 p=7 
// 12>7 y C=3 p=12  
// return C
