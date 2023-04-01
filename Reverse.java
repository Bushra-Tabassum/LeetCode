// a program to reverse the array
public class Reverse {

   public void rev(int n){
       int arr [] = new int[n];
       for(int i = 0 ;i<arr.length;i++){
           arr[i] = i;
           System.out.print(arr[i] +",");
       }
       System.out.println();
       double p= Math.floor(arr.length/2);
      int x =0;
       int y = arr.length-1;

       while(x<p)
       {
         int temp = arr[x];
         arr[x] = arr[y];
         arr[y]= temp;
         x++;
         y--;
       }

       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + ",");
       }

   }
}
