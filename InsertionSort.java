//NOTES//////////////////////////////////////////////////
//This class contains a insertion-sort method to sort arrays of integers
//Source of algorithm: Algorithms MIT CORMEN LEISERSON RIVESET STEIN 3rd
/////////////////////////////////////////////////////////

package barillas.byron.algorithmsMIT;
import java.util.Arrays;

/**
 *
 * @author byronBarillas
 */
public class InsertionSort {
    
    public static void InsertionSort(int[] A){
        for(int j =1; j < A.length; j++ ){
            int key = A[j];
            //Insert A[j] into the sorted sequence A[1 ... j-1]
            int i = j -1;
            
            while( (i >= 0) && (A[i] >= key)){      //The second factor needs to be tested only when the first is true
                A[i+1] = A[i];                      //Otherwise it tests A[-1] in the start of algorithms
                //DEBUG
                System.out.println("i: "+i);
                System.out.println(Arrays.toString(A));
                i = i - 1;
            }
            
            A[i+1] = key;     
        }  
    }
    
	//This function populates an int array with random integers from interval [1,t]
    public static void randomInts(int A[], int t){
        for(int i=0; i < A.length; i++) {
            A[i] = (int) (Math.random()*t) + 1;
	}
    }    



    public static void main(String[] args){
	int[] A = new int[100];
	//RANDOMISE ARRAY
	randomInts(A,100);
	System.out.println("ORIGINAL ARRAY: "+Arrays.toString(A));
	//SORT THE ARRAY
	InsertionSort(A);
	System.out.println("SORTED ARRAY:   " + Arrays.toString(A));
    }
        
}
    
    
    
    

    

    
    
    
    
    
    
    
    
}
