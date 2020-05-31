import java.util.Scanner;
import java.util.Arrays;
public class tech {
   public static void main(String args[] ) throws Exception {
	   int finalresult =0;
	   Scanner sc= new Scanner(System.in);
      int N=sc.nextInt();
      if(N<=10000000 && N>=1)
      {
      
      int a1[] = new int[10000000];
        for(int i = 0; i < N; i++)
        {
            a1[i] = sc.nextInt();
            
        }
         int a2[] = new int[10000000];
        for(int j = 0; j < N; j++)
        {
            a2[j] = sc.nextInt();
            
        }
        for(int j=0; j<N; j++)
        { 
        if(a1[j]<=0 && a1[j]>=Long.MAX_VALUE)
        {
        System.out.println("Constraint mismatch");
        System.exit(0);
        }
        if(a2[j]<=0 && a2[j]>=Long.MAX_VALUE)
        {
        System.out.println("Constraint mismatch");
        System.exit(0);
        }
        }
        int a3[] = new int[10000000];
        for (int x =0; x<N ;x++){
            a3[x] = a2[x]/a1[x];
            
    }
         finalresult=a3[0];
       
         for(int i=0; i<N; i++)
        {
        if(a3[i] < finalresult)
        finalresult = a3[i];
        }
        System.out.println(finalresult);
   }
      else {
    	  System.out.println("Constraint mismatch");
    	   }
      sc.close();
}}

