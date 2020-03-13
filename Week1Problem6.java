

import java.util.*;
public class FindTheNumberThatIsOnce{

    //funtion returns an integer that find the elemnet which is present in the array onlyn once and other are repeated thrice
    public static int findTheNumberThatIsOnce(ArrayList<Integer> tests)
    {
        int ones=0;
        int twos=0;
        int not_threes;
       for (int x:tests) {
twos ^= ones & x;
ones ^= x;
not_threes = ~(ones & twos);
ones &= not_threes;
twos &= not_threes;
}
return ones;
       
    }
    public static void main(String args[])
    {
        
        int expectedout[] = new int[5];
        ArrayList<ArrayList>inputvalues = new ArrayList<ArrayList>();
        int errors = 0 ;

        //test cases: Input values
        
        //testcase:1
        expectedout[0]=0;
         ArrayList<Integer> exp0=new ArrayList<Integer>(Arrays.asList(0));
        inputvalues.add(exp0);
        
        //testcase:2
       expectedout[1]=0;
          ArrayList<Integer> exp1=new ArrayList<Integer>(Arrays.asList(0,1,1,1));
        inputvalues.add(exp1);
        
        //testcase:3
        expectedout[2]=3;
          ArrayList<Integer> exp2=new ArrayList<Integer>(Arrays.asList(1,2,1,1,2,3,2));
        inputvalues.add(exp2);
        
        //testcase:4
       expectedout[3]=2;
          ArrayList<Integer> exp3=new ArrayList<Integer>(Arrays.asList(0,1,1,2,0,0,1));
        inputvalues.add(exp3);
        
        //testcase:5
        expectedout[4]=5;
         ArrayList<Integer> exp4=new ArrayList<Integer>(Arrays.asList(0,1,1,2,1,2,5,0,0,2));
        inputvalues.add(exp4);


        for (int i=0; i<5; i++)
        {

            if(expectedout[i]!=findTheNumberThatIsOnce(inputvalues.get(i)))
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










