
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MaxHeapTest 
{
    public static void main(String[] args) throws IOException
    {
    try{
        File file = new File("data_random.txt");
        Scanner scan = new Scanner(file);
        int [] random = new int[scan.nextInt()];
        int i=0;
        while(scan.hasNextInt())
        {   
            random[i] = scan.nextInt();
            System.out.print(random[i]+"\t");
            i++;
        }
        scan.close();
        

    }
    catch(FileNotFoundException e)
    {
        System.err.println("File not found");
    }
    catch(IOException e)
    {
        System.err.println("Unable to read file");
    }

    System.out.println();

    
   
        

        Scanner scan1 = new Scanner(new File("data_sorted.txt"));
        int [] sorted = new int[scan1.nextInt()];
        for (int i=0; i < sorted.length; i++)
        {
            sorted[i] = scan1.nextInt();
        }

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
