public class SelectionSort {
    int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
          int min = arr[i];
    int index = i;
    while(i < arr.length){
        if(min > arr[i]) 
        {
           min = arr[i];
           index = i;
        }
    i++;
    }
    return index;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for (int i = 0; i < arr.length; i++){
     int index = select(arr, i);
       swap(arr, i, index);
	    }}
  
 void swap(int arr[], int i, int minIdx){
     int temp = arr[i];
     arr[i]= arr[minIdx];
     arr[minIdx] = temp;
     
 }
}
