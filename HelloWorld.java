/* Airport security officials have confiscated several items of passengers at the security check point . All the items have been dumped into a huge box (array).  Each item possesses a certain amount of risk [0,1,2]. Here the risk severity of the items represent an array[] of N numbers of integer values . the task here is to sort the items based on their levels of risk in the array. the risk values range from 0 to 2 . */

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     
	int n=sc.nextInt();
	//int a[]={1,2,2,0,1,0,0};
	int[] a=new int[n];  
	for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {  
	for(int j=0;j<=i;j++){ 
	if(a[i]<a[j])
	{
           int b=a[i];
	a[i]=a[j];
	a[j]=b;
        }
	}
	}
        
	
	for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
    }
}
