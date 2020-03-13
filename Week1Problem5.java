

import java.util.*;
public class NoOfOnesInItsBinary{

    //funtion returns an array contains the number of ones in its binary  from 0 to given input in O(n) complexity
    public static ArrayList<Integer> noOfOnesInItsBinForm(int test)
    {
        int numOfSetBits=0;
        ArrayList<Integer>  NoOfOnes=new ArrayList<Integer>();
 
    int index = 1; //p tracks the index for number x
    int power = 1;
    NoOfOnes.add(0);
    for(int i=1; i<=test; i++){
        if(i==power){
            NoOfOnes.add(1);
            power <<= 1;
            index = 1;
        }else{
            NoOfOnes.add(NoOfOnes.get(index)+1);
            index++;
        }
 
    }
 
    return NoOfOnes;
       
    }
    public static void main(String args[])
    {
        
        int inputvalues[] = new int[5];
        ArrayList<ArrayList> expectedout = new ArrayList<ArrayList>();
        int errors = 0 ;

        //test cases: Input values
        
        //testcase:1
        inputvalues[0]=0;
         ArrayList<Integer> exp0=new ArrayList<Integer>(Arrays.asList(0));
        expectedout.add(exp0);
        
        //testcase:2
       inputvalues[1]=2;
          ArrayList<Integer> exp1=new ArrayList<Integer>(Arrays.asList(0,1,1));
        expectedout.add(exp1);
        
        //testcase:3
        inputvalues[2]=10;
          ArrayList<Integer> exp2=new ArrayList<Integer>(Arrays.asList(0,1,1,2,1,2,2,3,1,2,2));
        expectedout.add(exp2);
        
        //testcase:4
        inputvalues[3]=2;
          ArrayList<Integer> exp3=new ArrayList<Integer>(Arrays.asList(0,1,1));
        expectedout.add(exp3);
        
        //testcase:5
        inputvalues[4]=5;
         ArrayList<Integer> exp4=new ArrayList<Integer>(Arrays.asList(0,1,1,2,1,2));
        expectedout.add(exp4);


        for (int i=0; i<5; i++)
        {

            if(!expectedout.get(i).equals(noOfOnesInItsBinForm(inputvalues[i])))
            {
                errors++;
            }
        }
      if(errors>0)
        {
            System.out.println(errors + " Errors");
        }
        else
        {
            System.out.println("Passed all cases");
        }
    }
}









