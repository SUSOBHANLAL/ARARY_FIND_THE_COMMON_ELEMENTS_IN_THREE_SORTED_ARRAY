package findTheCommonElementIn3Array;

public class susobhan {
	public static void main(String args[]) {
		int arr1[]= {1,5,10,20,40,80};
		int arr2[]= {6,7,20,80,100};
		int arr3[]= {3,4,15,20,30,70,80};
		
		int a1= arr1.length;
		int a2= arr2.length;
		int a3= arr3.length;
		
		int arr11[]= new int[a1+a2+a3];
		int m= 0;
		
		int arr22[]= new int[a1+a2+a3];
		int n =0;



		for(int i=0;i<a1;i++) {
			for(int j=0;j<a2;j++) {
				if(arr1[i]==arr2[j]) {
					arr11[m]=arr1[i];//all the common element b/w arr1 and arr2 are copied to the arr1[]
					m++;
				}
			}
		}
		
		System.out.println("after comapring arr1 and arr2 the common element which are present");
		
		for(int i=0;i<m;i++) {
			System.out.print(arr11[i]+" ");
			
		}
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<a3;j++) {
				if(arr11[i]==arr3[j]) {
					arr22[n]=arr11[i];
					n++;
				}
			}
			
		}
		System.out.println();
		System.out.println("the final  answer will be ");
		
		for(int i=0;i<n;i++) {
			System.out.print(arr22[i]+" ");
			
		}
		
		
	}

}
