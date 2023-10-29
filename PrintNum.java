public class PrintNum {


//Print numbers from 5 to 1
public static void printNum5_1(int n){
if(n==0){
return;
}
System.out.println(n);
printNum5_1(n-1);
}

//Print numbers from 1 to 5
public static void printNum1_5(int n){
if(n==6){
return;
}
System.out.println(n);
printNum1_5(n+1);
}


public static void main(String [] args){
    printNum5_1(5);
    printNum1_5(1);

}

    }

