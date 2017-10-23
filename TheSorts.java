import java.util.Arrays;

public class TheSorts {
	//used for keeping track of bubble sort
	public static int bubbleComparisons = 0;
	public static int bubbleSwaps = 0;
	//used for keeping track of insertion sort
	public static int insertComparisons = 0;
	public static int insertSwaps = 0;
	//used for keeping track of quick sort
	public static int quickComparisons = 0;
	public static int quickswaps = 0;;
	public static int qcomparisons = 0;
	public static int qswaps = 0;
	//BUBBLE SORT
	public static void bubbleSort(int[] array){
		int lastPos; 
		int index;
		int temp;
		int swaps = 0;
		int comparisons = 0;
		
		for(lastPos = array.length - 1; lastPos >= 0; lastPos--){
			for(index = 0; index <= lastPos - 1; index++){
				comparisons++;
				if(array[index] > array[index + 1]){
					comparisons++;
					temp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = temp;
					swaps++;
				}
			}
		}
		System.out.println(swaps + " swaps were made.");
		System.out.println(comparisons + " comparisons were made.");
		bubbleSwaps = bubbleSwaps + swaps;
		bubbleComparisons = bubbleComparisons + comparisons; 
	}
	
	//INSERTION SORT 
	public static void insertionSort(int[] array){
		int unsortedValue;
		int scan; 
		int swaps = 0;
		int comparisons = 0;
		
		for(int index = 1; index < array.length; index++){
			unsortedValue = array[index];
			scan = index; 
			while(scan > 0 && array[scan - 1] > unsortedValue){
				array[scan] = array[scan - 1];
				scan--;
				swaps++;
				comparisons++;
			}
			array[scan] = unsortedValue;
			comparisons++;
		}
		System.out.println(swaps + " swaps were made.");
		System.out.println(comparisons + " comparisons were made." );
		quickComparisons = quickComparisons +  comparisons;
		insertSwaps = insertSwaps + swaps;
		insertComparisons = insertComparisons + comparisons;
	}
	
	//QUICK SORT
	public static void quickSort(int array[]){
		doQuickSort(array, 0, array.length - 1);
		System.out.println(qswaps + " swaps were made.");
		System.out.println(qcomparisons + " comparisons were made.");
		quickswaps = quickswaps +qswaps;
		quickComparisons = quickComparisons + qcomparisons; 
		qswaps = 0;
		qcomparisons = 0;
	}
	private static void doQuickSort(int array[], int start, int end){
		int pivotPoint;
		if(start < end){
			qcomparisons++;
			pivotPoint = partition(array, start, end);
			doQuickSort(array, start, pivotPoint - 1);
			doQuickSort(array, pivotPoint + 1, end);
		}
	}
	private static int partition(int array[], int start, int end){
		int pivotValue;
		int endOfLeftList;
		int mid;
		
		mid = (start + end) / 2;
		swap(array, start, mid);
		pivotValue = array[start];
		endOfLeftList = start;
		
		for(int scan = start + 1; scan <= end; scan++){
			qcomparisons++;
			if(array[scan] < pivotValue){
				endOfLeftList++;
				swap(array, endOfLeftList, scan);
			}
		}
		swap(array, start, endOfLeftList);
		return endOfLeftList;
	}
	private static void swap(int[] array, int a, int b){
		int temp;
		
		temp = array[a];
		array[a] = array[b];
		qswaps++;
		array[b] = temp;

	}
	
	public static int[] numberGen(int n){
		int[] numbers = new int[n];       
	    for(int i = 0; i < numbers.length; i++) {
	      numbers[i] = (int)(Math.random()*99+1);
	    }
	    System.out.println("Numbers Generated: " + Arrays.toString(numbers));
	    return numbers;
	}
	
	
	public static void main(String[] args) {
		int i = 0; 	

		   while(i <= 9){
			   int[] bubbleNumbers = numberGen(10);
			   bubbleSort(bubbleNumbers);
			   System.out.println("Bubble Sort: " + Arrays.toString(bubbleNumbers));
			   System.out.println("-------------------------------------------------------------------------");
			   int[] insertNumbers = numberGen(10);
			   insertionSort(insertNumbers);
			   System.out.println("Insert Sort: " + Arrays.toString(insertNumbers));
			   System.out.println("-------------------------------------------------------------------------");
			   int[] quickNumbers = numberGen(10);
			   quickSort(quickNumbers);;
			   System.out.println("Quick Sort: " + Arrays.toString(quickNumbers));
			   System.out.println("-------------------------------------------------------------------------");
			   i++;
		   }
		   System.out.println("Average swaps made for bubbleSort: " + bubbleSwaps/10);
		   System.out.println("Average comparisons made for bubbleSort: " + bubbleComparisons/10);
		   System.out.println("Average swaps made for insertionSort: " + insertSwaps/10);
		   System.out.println("Average comparisons made for insertionSort: " + insertComparisons/10);
		   System.out.println("Average swaps made for QuickSort: " + quickswaps/10);
		   System.out.println("Average comparisons made for QuickSort: " + quickComparisons/10);
		   
		   
		   System.out.println("*****************************************************************************"); 
		   System.out.println("*****************************************************************************"); 
		   System.out.println("*****************************************************************************"); 
		   System.out.println("*****************************************************************************"); 
		   
		   i=0;
		   while(i <= 9){
			   int[] bubbleNumbers = numberGen(100);
			   bubbleSort(bubbleNumbers);
			   System.out.println("Bubble Sort: " + Arrays.toString(bubbleNumbers));
			   System.out.println("-------------------------------------------------------------------------");
			   int[] insertNumbers = numberGen(100);
			   insertionSort(insertNumbers);
			   System.out.println("Insert Sort: " + Arrays.toString(insertNumbers));
			   System.out.println("-------------------------------------------------------------------------");
			   int[] quickNumbers = numberGen(100);
			   quickSort(quickNumbers);;
			   System.out.println("Quick Sort: " + Arrays.toString(quickNumbers));
			   System.out.println("-------------------------------------------------------------------------");
			   i++;
		   }
		   System.out.println("Average swaps made for bubbleSort: " + bubbleSwaps/10);
		   System.out.println("Average comparisons made for bubbleSort: " + bubbleComparisons/10);
		   System.out.println("Average swaps made for insertionSort: " + insertSwaps/10);
		   System.out.println("Average comparisons made for insertionSort: " + insertComparisons/10);
		   System.out.println("Average swaps made for QuickSort: " + quickswaps/10);
		   System.out.println("Average comparisons made for QuickSort: " + quickComparisons/10);
		   
		   System.out.println("*****************************************************************************"); 
		   System.out.println("*****************************************************************************"); 
		   System.out.println("*****************************************************************************"); 
		   System.out.println("*****************************************************************************"); 
		   i=0;
		   while(i <= 9){
			   int[] bubbleNumbers = numberGen(1000);
			   bubbleSort(bubbleNumbers);
			   System.out.println("Bubble Sort: " + Arrays.toString(bubbleNumbers));
			   System.out.println("-------------------------------------------------------------------------");
			   int[] insertNumbers = numberGen(1000);
			   insertionSort(insertNumbers);
			   System.out.println("Insert Sort: " + Arrays.toString(insertNumbers));
			   System.out.println("-------------------------------------------------------------------------");
			   int[] quickNumbers = numberGen(1000);
			   quickSort(quickNumbers);;
			   System.out.println("Quick Sort: " + Arrays.toString(quickNumbers));
			   System.out.println("-------------------------------------------------------------------------");
			   i++;
		   }
		   System.out.println("Average swaps made for bubbleSort: " + bubbleSwaps/10);
		   System.out.println("Average comparisons made for bubbleSort: " + bubbleComparisons/10);
		   System.out.println("Average swaps made for insertionSort: " + insertSwaps/10);
		   System.out.println("Average comparisons made for insertionSort: " + insertComparisons/10);
		   System.out.println("Average swaps made for QuickSort: " + quickswaps/10);
		   System.out.println("Average comparisons made for QuickSort: " + quickComparisons/10);
		   
		  
	
		}
}
	

