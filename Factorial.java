public class Factorial {

    //print factorial of a number n
    public static int facto(int n){
        if(n==0 || n==1){
            return 1;}
        int fact_n = facto(n-1);
         int fact = n*fact_n;
        return fact;

    }

    public static void main(String [] args){
      int value = facto(5);
        System.out.println(value);
    }
}
