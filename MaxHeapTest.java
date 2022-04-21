
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class MaxHeapTest 
{
    public static void main(String[] args) throws IOException
    {
   
        File file = new File("data_random.txt");
        Scanner scan = new Scanner(file);
        Integer[] random = new Integer[100];
    
        for (int i = 0; i < random.length; i++) 
        {   
            random[i] =  Integer.valueOf(scan.nextInt());
            System.out.print(random[i]+"\t");
        }
       
        // newRandom.MaxHeap(random);
        
        

        scan.close();
        
        
       
    
   
    System.out.println();

   
        File file1 = new File("data_sorted.txt");
        Scanner scan1 = new Scanner(file1);
        Integer [] sorted = new Integer[100];
    
        for (int j = 0; j < sorted.length; j++) 
        {   
            sorted[j] =  Integer.valueOf(scan1.nextInt());
            System.out.print(sorted[j]+"\t");
        }
       
        // newRandom.MaxHeap(random);
        

        scan1.close();
        MaxHeap<Integer> heap1 = new MaxHeap<Integer>();
        for (int i = 0; i < random.length; i++) 
        {   
           heap1.add(random[i]);
        }
        MaxHeap<Integer> heap2 = new MaxHeap<Integer>(random);

   

    System.out.println();

    
   
        


        FileWriter file2 = new FileWriter("output.txt");
        file2.write("Random Data\n");
        file2.write("Heap built using sequential insertions: ");
        // output of first 10 ints of array here
     
        file2.write(heap1.toString());
        file2.write("\n");
       
       

        
        file2.write("Number of swaps in the heap creation: ");
        // output of number of swaps here
        file2.write(heap1.getswaps() + "");
        file2.write("\n");
        file2.write("Heap after 10 removals: ");
        // output of heaps after 10 removals
        for (int index = 1; index <= 10; index++) 
        {
           heap1.removeMax();
    
        }
        file2.write(heap1.toString());
        
        file2.write("\n");
       
        
        /*
            optimal method
        */
        file2.write("\nHeap built using optimal insertions: ");
        // output of first 10 ints of array here
        file2.write(heap2.toString());
        file2.write("\n");
        file2.write("Number of swaps in the heap creation: ");
        // output of number of swaps here
        file2.write(heap2.getswaps() + "");
        file2.write("\n");
        file2.write("Heap after 10 removals:  ");
        // output of heaps after 10 removals
        for (int index = 1; index <= 10; index++) 
        {
           heap2.removeMax();
    
        }
        file2.write(heap2.toString());

        file2.write("\n");
        file2.write("\n");
        file2.write("Sorted Data\n");
////////////////////////
        MaxHeap<Integer> heap3 = new MaxHeap<Integer>();
        for (int i = 0; i < sorted.length; i++) 
        {   
           heap3.add(sorted[i]);
        }
        MaxHeap<Integer> heap4 = new MaxHeap<Integer>(sorted);

        file2.write("Heap built using sequential insertions: ");
        // output of first 10 ints of array here
     
        file2.write(heap3.toString());
        file2.write("\n");
       
       

        
        file2.write("Number of swaps in the heap creation: ");
        // output of number of swaps here
        file2.write(heap3.getswaps() + "");
        file2.write("\n");
        file2.write("Heap after 10 removals: ");
        // output of heaps after 10 removals
        for (int index = 1; index <= 10; index++) 
        {
           heap3.removeMax();
    
        }
        file2.write(heap3.toString());
        
        file2.write("\n");
       
        
        /*
            optimal method
        */
        file2.write("\nHeap built using optimal insertions: ");
        // output of first 10 ints of array here
        file2.write(heap4.toString());
        file2.write("\n");
        file2.write("Number of swaps in the heap creation: ");
        // output of number of swaps here
        file2.write(heap4.getswaps() + "");
        file2.write("\n");
        file2.write("Heap after 10 removals:  ");
        // output of heaps after 10 removals
        for (int index = 1; index <= 10; index++) 
        {
           heap4.removeMax();
    
        }
        file2.write(heap4.toString());




        file2.close();

    }
    
    
   
}
