//Find the minimum and maximum element in an array
public class MaxMin {

    public void findMinMax (int n){
        int arr [] = new int[n];
        for(int i = 0 ;i<arr.length;i++){
            arr[i] = i;
            System.out.print(arr[i] +",");
        }
        System.out.println();
        min(arr);
        max(arr);
    }

    public void min(int [] arr){
       int min=0 ;
        for(int i = 0 ;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                if( arr[i+1]< min){
                min = arr[i+1];
                }
            }
            else if(arr[i]<arr[i+1]){
                if( arr[i]< min){
                    min= arr[i];
                }

            }
        }
        System.out.println("min is " + min);
    }

    public void max(int [] arr){
        int max = 0;
        for(int i = 0 ;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                max = arr[i];
            }
            else if(arr[i]<arr[i+1]){
                max= arr[i+1];
            }
        }
        System.out.println("max is " + max);
    }
}
