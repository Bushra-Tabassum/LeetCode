public class SumOfNum {
    //print sum of first n natural  numbers (descending order)
    public static void printSum(int n ,int sum ){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n-1, sum);
    }

    //print sum of first n natural  numbers (ascending order)
    public static void printSum(int n ,int sum,int x){
        if(x>n){
            System.out.println(sum);
            return;
        }
        sum += x;
        printSum(n, sum ,x+1);
    }

    public static void main(String [] args){
        printSum(5,0);
        printSum(5,0,1);
    }

}
