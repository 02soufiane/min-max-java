import java.util.Scanner;
public class st {
    public static void main(String[] args)
    {
       int[] T =  new int[5];
       Scanner s = new Scanner(System.in);

       for(int i =0 ; i < T.length ; i++)
       {
           T[i]=s.nextInt();
       }

       int min=T[0],max=T[0];

       for(int i=1 ; i < T.length ; i++)
       {
           if(min > T[i])
           {
               min=T[i];
           }else if(max < T[i]) {
               max=T[i];
           }
       }

       System.out.println("min :" +min);
       System.out.println("max :" +max);
    }
}
