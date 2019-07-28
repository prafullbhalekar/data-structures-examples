class BubbleSort 
{ 
    void bubbleSort(int arr[]) 
    { 
        // Lenght of the array to be sorted
        int n = arr.length; 

        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 

                // Loop through 2 adjacent array elements and compare them
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] as arr[j] is greater than arr[j+1]
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
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
  
    public static void main(String args[]) 
    { 
        // Create an object of Bubble Sort 
        BubbleSort bubbleSort = new BubbleSort(); 

	// Initialize an array to be sorted
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 

	// Sort the array
        bubbleSort.bubbleSort(arr); 

        System.out.println("Sorted array"); 
        bubbleSort.printArray(arr); 
    } 
}
