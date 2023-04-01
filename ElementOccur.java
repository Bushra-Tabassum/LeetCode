//Find the occurrence of an integer in the array
public class ElementOccur {

    public  void occurance(int [] arr, int num){
        int value = num;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                count++;
            }
        }
        System.out.println(value + " has occured " + count + " times");
    }


    public void occurTime(int [] arr ) {

        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]==0){
                    j++;
                }
                 else if(arr[i]==arr[j]){
                    arr[j]=0;
                    count++;

                }

            }
            if(arr[i]!=0){
                System.out.print(arr[i] + "was repeated " + count + " times" );
            }
            System.out.println();


        }

    }


}
