public class Sorting {

//time complexity = O(n^2)
    public void bubleSort(int [] arr){
        int x=0;
        while(x<arr.length-1){
            for(int i =0 ; i<arr.length-x-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
            x++;
        }
        printArray(arr);
    }

    public void selectionSort(int [] arr){
        for(int i = 0;i< arr.length;i++){
            int smallestOfAll = i;

           for(int j = i+1 ; j<arr.length;j++) {
               if(arr[j] < arr[smallestOfAll]) {
                   smallestOfAll = j;
               }
           }
            int temp = arr[smallestOfAll];
            arr[smallestOfAll] = arr[i];
            arr[i] =temp;
        }

        printArray(arr);
    }


    public void insertionSort(int [] arr){
        for(int i =1 ;i<arr.length;i++){

                int j = i-1;
                while(j>=0 ){
                    if(arr[j] >arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j]=temp;}
                    j--;
                }

            }

        printArray(arr);
    }




    public void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

}
