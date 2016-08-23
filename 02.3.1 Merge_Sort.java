//NOTES//////////////////////////////////////////////////
//This class contains a merge-sort method to sort arrays of integers
//Source of algorithm: Algorithms MIT CORMEN LEISERSON RIVESET STEIN
/////////////////////////////////////////////////////////

package barillas.byron.algorithmsMIT;
//Imports/////////////////////////////////////////////////
/////////////////////////////////////////////////////////
import java.util.Arrays;

//Main Class//////////////////////////////////////////////
/////////////////////////////////////////////////////////
public class Merge_Sort {

//Methods:Static/////////////////////////////////////////
////////////////////////////////////////////////////////
	
//Merges two ordered sub-arrays in A 
	public static void Merge(int[] A,int p,int q,int r){
		int n1  = q - p + 1;
		int n2 = r-q;
		int[] L = new int[n1+1];			//will be filled with elements of
		int[] R = new int[n2+1];			//A and a sentinel value at the end
		
		for(int i = 0; i<n1; i++){			//Copy A[p, ... ,q]
			L[i] = A[p+i];		
		}
		for(int j = 0; j<n2; j++){			//Copy A[q+1, ...,r]
			R[j] = A[q+1+j];
		}
		
		L[n1] =  2147483647;				//Sentinel value 
		R[n2] = 2147483647;
		
				
		int i = 0;
		int j = 0;
		for(int k=p; k <= r; k++){			// Merge L,R on A[p, ... , r]
			
			if(L[i] < R[j]){
				A[k] = L[i];
				i++;
			}else{
				A[k] = R[j];
				j++;	
			}						
		}
		
	}
	
//MERGE-SORT: 
	public static void MergeSort(int[] A,int p,int r){
		
		if(p < r){
	
			int q = (p + r)/2;
			MergeSort(A,p,q);
			MergeSort(A,q+1,r);
			Merge(A,p,q,r);
		}
	}
	
	//This function populates an int array with random integers from interval [1,t]
	public static void randomInts(int A[], int t){
		for(int i=0; i < A.length; i++) {
			A[i] = (int) (Math.random()*t) + 1;
		}
	}

	
	
//MAIN Method///////////////////////////////////////////////	
///////////////////////////////////////////////////////////

	public static void main(String[] args) {
		int[] A = new int[20];
		//RANDOMISE ARRAY
		randomInts(A,100);
		System.out.println("ORIGINAL ARRAY: "+Arrays.toString(A));
		//SORT THE ARRAY
		MergeSort(A,0,A.length-1);
		System.out.println("SORTED ARRAY:   " + Arrays.toString(A));
	}

}
