import java.util.*;
public class increment{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        //post increment
        n=5;
        System.out.println(n++);
        //pre increment
        a=4;
        System.out.println(++a);
    }
}