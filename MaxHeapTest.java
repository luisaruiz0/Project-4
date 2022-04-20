
import java.io.FileWriter;
import java.io.IOException;

public class MaxHeapTest 
{
    public static void main(String[] args) throws IOException
    {
        FileWriter file1 = new FileWriter("output.txt");
        file1.write("Heap built using sequential insertions: ");
        // output of first 10 ints of array here
        file1.write("Number of swaps in the heap creation: ");
        // output of number of swaps here
        file1.write("Heap after 10 removals:  \n");
        // output of heaps after 10 removals
       
        
        /*
            optimal method
        */
        file1.write("\nHeap built using optimal insertions: ");
        // output of first 10 ints of array here
        file1.write("Number of swaps in the heap creation: ");
        // output of number of swaps here
        file1.write("Heap after 10 removals:  ");
        // output of heaps after 10 removals
        file1.close();

    }
}
