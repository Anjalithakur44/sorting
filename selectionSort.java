import java.util.Arrays;
//Time complexity=O(n^2)and it is better tha bubble sort as ss gives less swaps than bubble sort
public class selectionSort {
    public static void so(int a[])
    {
        int i,j,n=a.length,temp=0,max=0;
        for(i=0;i<n;i++)
        {
            max=i;
            for(j=i+1;j<n;j++)
            {
                if(a[max]<a[j])
                {
                    max=j;
                }
            }
            if(max!=i)
            {
                temp=a[max];
                a[max]=a[i];
                a[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={20,50,10,15,17,25,65};
        so(a);
        System.out.println("The sorted array in descending order="+Arrays.toString(a));
    }
}
