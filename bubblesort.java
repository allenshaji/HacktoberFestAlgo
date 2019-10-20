public class BubbleSortExample
{
    public static void main(String[] args)
    {
        // This is unsorted array
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
 
        // Let's sort using bubble sort
        bubbleSort(array, 0, array.length);
 
        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }
 
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void bubbleSort(Object[] array, int fromIndex, int toIndex)
    {
        Object d;
        for (int i = toIndex - 1; i > fromIndex; i--)
        {
            boolean isSorted = true;
            for (int j = fromIndex; j < i; j++)
            {
                //If elements in wrong order then swap them
                if (((Comparable) array[j]).compareTo(array[j + 1]) > 0)
                {
                    isSorted = false;
                    d = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = d;
                }
            }
            //If no swapping then array is already sorted
            if (isSorted)
                break;
        }
    }
}
 
Output: [3, 6, 10, 12, 13, 24, 70, 90]

1. Bubble sort belongs to O(n2) sorting algorithms, which makes it quite inefficient for sorting large data volumes.
2. Bubble sort is both stable and adaptive.
3. In the case of nearly sorted data, bubble sort takes O(n) time, but requires at least 2 passes through the data.
4. It can be practical if the input is usually in sort order but may occasionally have some out-of-order elements nearly in position.
5. Bubble sort should be avoided in the case of large collections.
6. It will not be efficient in the case of a reverse-ordered collection.

Cited: https://howtodoinjava.com/algorithm/bubble-sort-java-example/
