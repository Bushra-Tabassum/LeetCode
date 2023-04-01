//find the 2s sum
public class SumOfInx {

    public void whichIdx(int [] arr, int sum){
        int idx1,idx2 = 0;

        for(int i=0;i<arr.length;i++){
            int count=arr[i];
            idx1=i;
            for(int j = i+1;j<arr.length;j++){
                count = count + arr[j];

                if(count==sum){
                    idx2 = j;
                    System.out.println(sum +" sum was found in " + idx1 +" to " + idx2);
                    break;
                }
            }
        }
    }
}
