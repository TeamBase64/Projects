public class BubbleSortTest { 
	   public static void main(String[] args)   { 
	     Integer[] values = {5, 1, 3, 6, 4, 2}; 
	     String[] st = {"hello","goodbye","chao","adios"};
	     Double[] doub = {2.2,2.0,2.4};
	     System.out.println("Original order: ");     for (int element : values)      
	    	 System.out.print(element + " "); 
	     		System.out.println();
	     System.out.println("Original order: ");     for (String element : st)      
	    	 System.out.print(element + " ");
	     		System.out.println();
	     System.out.println("Original order: ");     for (Double element : doub)      
	    	 System.out.print(element + " ");
	     		System.out.println();
	     GenericBubbleSorter.bubbleSort(values); 
	     GenericBubbleSorter.bubbleSort(st);
	     GenericBubbleSorter.bubbleSort(doub);
	     System.out.println("\nSorted order: ");     for (int element : values)       
	    	 System.out.print(element + " "); 
	     System.out.println(); 
	     System.out.println("\nSorted order: ");     for (String element : st)       
	    	 System.out.print(element + " "); 
	     System.out.println();
	     System.out.println("\nSorted order: ");     for (Double element : doub)       
	    	 System.out.print(element + " "); 
	     System.out.println();
	     
	     } 
	   }
