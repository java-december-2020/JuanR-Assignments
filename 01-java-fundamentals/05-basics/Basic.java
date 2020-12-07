import java.util.ArrayList;
class Basic {
    public static void main(String[] args){
        for(int i=0; i<=255; i++){
            System.out.println("Count is: " + i);
        }
        for(int i=0; i<=255; i++){
        if(i % 2 != 0)
            System.out.println(i);
        }
        int num1 = 5, num2 = 5, sum;
        sum = num1 + num2;
        System.out.println("The sum of these numbers is " + sum);
    public static void LoopArray(int[] arr) {
        for(int val: arr)
            System.out.println(val);
    }
    }
}