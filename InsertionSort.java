import java.util.Scanner;
 

public class InsertionSort 
{
    public void insertionSort(int arr[])
    {
        // Number of elements to be sorted
        int N = arr.length;

	// Variabls to keep a track of index and temporary variables
        int i, j, temp;

	// Loop through array elements startng from 1, as element at 0th place is already sorted
        for (i = 1; i< N; i++) 
        {
            j = i;
            temp = arr[i];    // temp is the element we need to insert ino already sorted sub-array
            while (j > 0 && temp < arr[j-1]) // Compare temp with all the elements from sorted sub-array
            {
		// As temp is smaller than arr[j-1], shift arr[j-1] to it's right 
                arr[j] = arr[j-1];
                j = j-1; // next index to compare
            }
	    /* j here is either
               0 --> that means temp is the smallest element or
              some index between 0-i, where all elements on j's right are bigger than temp and
              all elements on left are smaller than temp, so insert temp at arr[j] */
            arr[j] = temp;            
        }        
    }    

    void printArray(int arr[]) 
    { 
        // Lenght of the array to be sorted
        int n = arr.length; 

	// Loop through all the elements one by one and print it
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 

        System.out.println(); 
    } 

    public static void main(String[] args) 
    {
	// Read input from user
        Scanner scan = new Scanner( System.in );        

        int n, i;

        // Accept number of elements
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();

        // Create integer array of n elements
        int arr[] = new int[ n ];

        // Read elements
        System.out.println("\nEnter "+ n +" integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();

	// Create insertion sort object
        InsertionSort sortObj = new InsertionSort();

	// Sort an array 
        sortObj.insertionSort(arr);

        System.out.println("Sorted array"); 
        sortObj.printArray(arr);                      
    }    
}
