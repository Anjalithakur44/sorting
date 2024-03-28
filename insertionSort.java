//time complexity=O(n^2)
//WORST CASE=when array is in descending order we should not apply insertion sort
//BEST AND AVERAGE CASE(o(n))=when array is almost/fully sorted and relative order is maintained so it is a stable sort
public class insertionSort {
    public static void isd(int a[])
    {//in descending order
        int i,j,n=a.length,temp=0;
        for(i=1;i<n;i++)
        {
            j=i;
            while(j>0 && a[j]>a[j-1])
            {
                temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }  
        System.out.println("IN DESCENDING ORDER=");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }  
        System.out.println();
    }
    
    public static void  isa(int []a)
    {
        int i,j,n=a.length,temp=0;
        for(i=1;i<n;i++)
        {
            j=i;
            while(j>0 && a[j]<a[j-1])
            {
                temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
        System.out.println("IN ASCENDING ORDER=");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        } 
    }
    public static void main(String[] args) {
        int a[]={20,40,11,19,27,45};
        isd(a);
        isa(a);
    }
}
