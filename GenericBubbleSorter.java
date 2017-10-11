public class GenericBubbleSorter {
	public static <E extends Comparable<E>> void bubbleSort(E[] array) {
		int lastPos;
		int index;
		E temp;
		for (lastPos = array.length - 1; lastPos >= 0; lastPos--) {
			for (index = 0; index <= lastPos - 1; index++) {
				if(array[index].compareTo(array[index + 1]) > 0) {
				temp = array[index];
				array[index] = array[index + 1];
				array[index + 1] = temp;
			}
		}
	}}
}