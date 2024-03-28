import java.util.*;
import java.io.*;
public class bubbleSort {
    public static void bo(int a[],int m)
    {
        int k,j,temp;
        boolean swap=false;
        for(k=0;k<m;k++)
        {
            for(j=0;j<m-k-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    swap=true;
                }
            }
            if(!swap)
            {
            break;
            } 
        }
       
        System.out.println("The sorted array in descending order=");
        for(k=0;k<m;k++)
        {
            System.out.print(a[k]+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,i;
        int a[]=new int[10];
        System.out.println("Enter size of array=");
        m=sc.nextInt();
        System.out.println("Enter array elements=");
        for(i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        bo(a,m);
        
    }
}
