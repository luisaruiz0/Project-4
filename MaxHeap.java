import java.util.Arrays;
/**
   A class that implements the ADT maxheap by using an array.
 
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public final class MaxHeap<T extends Comparable<? super T>>
             implements MaxHeapInterface<T>
{
   private T[] heap;      // Array of heap entries; ignore heap[0]
   private int lastIndex; // Index of last entry and number of entries
   private boolean integrityOK = false;
   public char{} toString;
	private static final int DEFAULT_CAPACITY = 25;
	private static final int MAX_CAPACITY = 10000;
	private int swaps=0;
   
   public void checkIntegrity() {
		if (integrityOK == false) {
			throw new SecurityException("Heap is corrupt");
		}
	}

	public void checkCapacity(int capacity) {
		if (capacity > MAX_CAPACITY) {
			throw new IllegalStateException("Attempt to create maxheap " +
					"capacity exeeds allowed maximum of " + MAX_CAPACITY);
		}
	}
   public void ensureCapacity() {
		if (lastIndex >= heap.length-1) {
			int newLength = 2*heap.length;
			checkCapacity(newLength);
			heap = Arrays.copyOf(heap, newLength);
		}
	}
   public MaxHeap()
   {
      this(DEFAULT_CAPACITY); // Call next constructor
   } // end default constructor
   
   public MaxHeap(int initialCapacity)
   {
      // Is initialCapacity too small?
      if (initialCapacity < DEFAULT_CAPACITY)
         initialCapacity = DEFAULT_CAPACITY;
      else // Is initialCapacity too big?
         checkCapacity(initialCapacity);
      
      // The cast is safe because the new array contains null entries
      @SuppressWarnings("unchecked")
      T[] tempHeap = (T[])new Comparable[initialCapacity + 1];
      heap = tempHeap;
      lastIndex = 0;
      integrityOK = true;
   } // end constructor
   public MaxHeap(T[] entries)
   {
      this(entries.length); //call other contructor
      assert integrityOK = true;
      //copy given array to data field
      for (int index=0; index<entries.length; index++)
         heap[index + 1] = entries[index];
      this.lastIndex= entries.length;
         //create heap
      for (int rootIndex = lastIndex/2; rootIndex>0; rootIndex--)
         reheap(rootIndex);
   }




   public void add(T newEntry)
   {
      checkIntegrity();        // Ensure initialization of data fields
   int newIndex = lastIndex + 1;
   int parentIndex = newIndex / 2;
   while ( (parentIndex > 0) && newEntry.compareTo(heap[parentIndex]) > 0)
   {
      heap[newIndex] = heap[parentIndex];
      newIndex = parentIndex;
      parentIndex = newIndex / 2;
      swaps++;
   } // end while

   heap[newIndex] = newEntry;
   lastIndex++;
   ensureCapacity();
   } // end add

   public T removeMax()
   {
      checkIntegrity();             // Ensure initialization of data fields
   T root = null;

   if (!isEmpty())
   {
      root = heap[1];            // Return value
      heap[1] = heap[lastIndex]; // Form a semiheap
      lastIndex--;               // Decrease size
      reheap(1);                 // Transform to a heap
   } // end if

   return root;
   // See Segment 27.12. 
   } // end removeMax

   public T getMax()
   {
		checkIntegrity();
      T root = null;
      if (!isEmpty())
         root = heap[1];
      return root;
   } // end getMax

   public boolean isEmpty()
   {
      return lastIndex < 1;
   } // end isEmpty

   public int getSize()
   {
      return lastIndex;
   } // end getSize

   public void clear()
   {
		checkIntegrity();
      while (lastIndex > -1)
      {
         heap[lastIndex] = null;
         lastIndex--;
      } // end while
      lastIndex = 0;
   } // end clear
private void reheap(int random)
   {
      boolean done = false;
      T orphan = heap[random];
      int leftChildIndex = 2 * random;
      while (!done && (leftChildIndex <= lastIndex))
         {
            int largerChildIndex = leftChildIndex;
            // Assume larger
            int rightChildIndex = leftChildIndex + 1; 
            if ( (rightChildIndex <= lastIndex) && heap[rightChildIndex] .compareTo(heap[largerChildIndex]) > 0)
            {
               largerChildIndex = rightChildIndex;
            } // end if
            if (orphan. compareTo(heap[largerChildIndex]) < 0)
            {
               heap[random] = heap[largerChildIndex];
               random = largerChildIndex;
               leftChildIndex = 2 * random;
	       swaps++;
            }
            else
               done = true;
         } // end while
      heap[random] = orphan;
   } // end reheap
   public String toString() {
      String s = "";
      for (int index = 1; index <= 10; index++){
         s = s + heap[index];
	 if (index!=10){
	    s = s + ", ";
	 }
	 else{
	    s = s + ",...";
	 }
      }
      return s;
   }
   
   public int getswaps()
   {
      return swaps;
   }
// Private methods
// . . .
} // end MaxHeap
