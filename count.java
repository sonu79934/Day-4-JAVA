import java.util.*;
public class count{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++)
        {
            int n=sc.nextInt();
            int c=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0){
                    c+=1;
                }
                }
                System.out.println(c);
            }
        }
    }
