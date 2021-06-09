import java.util.ArrayList;

class basics{
    public static void main(String [] args){
        int sum=0;
        // for ( int i =0;i<=255;i++){
        //     System.out.println(i);
        // }
        // for ( int i =0;i<=255;i++){
        //     if ( i % 2 !=0)
        //     System.out.println(i);
        // }
        // for ( int i =0;i<=255;i++){
        //     System.out.println("new number :"+i+"Sum:"+sum);
        //     sum+=i;
        // }
        int[] intArray = new int[]{ 1,-5,3,4,5,6,7,8,9,10 };
        // for (int i =0;i<intArray.length;i++){
        //     System.out.println(intArray[i]);
        // } 
        // int g=findMax(intArray);
        // System.out.println(g);
        // System.out.println(findAvg(intArray));
        // ArrayList<Integer> odds = new ArrayList<Integer>();
        // for (Integer i =0;i<=255;i++){
        //     if(i%2 != 0){
        //         odds.add(i);
        //     }
        // }
        // for (Integer num:odds){
        //     System.out.println(num);
        // }
        int[] x=shift(intArray);
        for (int i =0;i<x.length;i++){
            System.out.println(x[i]);
        }
      
    }
    static int findMax(int[] intArray){
        int max=intArray[0];
        for (int i =1;i<intArray.length;i++){
            if(intArray[i]>max){
                max=intArray[i];
            }
        }
        return max;
    }
    static double findAvg(int[] intArray){
        double sum=0;
        for (int i =1;i<intArray.length;i++){
            sum+=intArray[i];
        }
        double avg=sum/(intArray.length-1);
        return avg;
    }
    static int graterThanY(int[] intArray,int y){
        int sum=0;
        for (int i=0;i<intArray.length;i++){
            if (intArray[i]>y){
                sum++;
            }
        }
        return sum;
    }
    static int[] squarevalues(int[] intArray){
        int[] x=new int[intArray.length];
        for(int i =0;i<intArray.length;i++){
            x[i]=intArray[i]*intArray[i];
        }
        return x;
    }
    static int[] eliminateNeg(int[] arr){
        int[] newarr=new int[arr.length];
        for (int i =0; i<arr.length;i++){
            if (arr[i]<0){
                newarr[i]=0;
            }
            else{
                newarr[i]=arr[i];
            }
        }
        return newarr;
    }
    static int[] maxminavg(int[] arr){
        int max=arr[0];
        int min=arr[0];
        double sum=0;
        int[] newarr=new int[3];
        for (int i =1;i<arr.length;i++){
            sum+=arr[i];
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        double avg=sum/(arr.length-1);
        newarr[0]=max;
        newarr[1]=min;
        newarr[2]=(int) avg;
        return newarr;
    }
    static int[] shift(int[] arr){
        int[] newarr=new int[arr.length];
        int j=1;
        for(int i =0;i<arr.length;i++){
            if(j<arr.length){
                newarr[i]=arr[j];
                j++;
            }
        }
        newarr[arr.length-1]=0;
        return newarr;
    }
}