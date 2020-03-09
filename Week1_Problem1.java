
import java.lang.*;
import java.io.*;
import java.util.*;

public class XorOfElements
{
    //To Store the XOR values
    HashMap<Integer,Integer> xor_Values =new HashMap<>();
    
    //This function finds the Xor values till the index and store them into hashmap
    void findXORValuesOfArrayTillIndex(int array[],int lenOfArray)
    {
        int xor=0;
        for(int index=0;index<lenOfArray;index++)
        {
            xor=xor^array[index];
            xor_Values.put(index,xor);
        }
        
    }
    
    
    //to print xor values for given range of indexes
    void printXorValues(int startIndex,int endIndex){
        
        if(startIndex!=0)
        {
            startIndex=startIndex-1;
        System.out.print((xor_Values.get(endIndex)^xor_Values.get(startIndex))+" ");
        }
        else{
            System.out.print(xor_Values.get(endIndex)+" ");
        }
    }
    
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int numberOfElements=sc.nextInt();
	     
	     //taking the inputs
	     XorOfElements main=new XorOfElements();
	     
	    int [] array=new int[numberOfElements];
	    for(int index=0;index<numberOfElements;index++)
	    {
	        array[index]=sc.nextInt();
	    }
	    int noOfQueries=sc.nextInt();
	    int startIndex,endIndex;
	    
	    //find xor values of given array
	    main.findXORValuesOfArrayTillIndex(array,numberOfElements);
	    
	    //take queries from input
	    for(int i=0;i<noOfQueries;i++)
	    {
	        startIndex=sc.nextInt();
	        endIndex=sc.nextInt();
	        main.printXorValues(startIndex,endIndex);
	    }

	}
}
