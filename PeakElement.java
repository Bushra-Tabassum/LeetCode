//Find a peak element which is not smaller than its neighbors
public class PeakElement {
    int [] arr = {1,4,5,7,3,15,6};
    public void peak(){
      for(int i=0;i<arr.length-2;i++){
          if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
              int temp = arr[i+1];
              System.out.println(temp);
          }

      }
    }
}
