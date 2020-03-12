


public class MinimumReplacementToOne{

    //return the minimum number of flips required to flip to make a or b==c
    public static int minimunReplacements(int test)
    {
        int count=0;
        if(test==0)
        return 1;
       while(test!=1)
       {
           if((test & 1)==0)
           {
               test=test/2;
           }
           else{
               test=test-1;
           }
           count++;
       }
       return count;
    }
    public static void main(String args[])
    {
        
        int inputvalues[] = new int[5];
        int expectedout[] = new int[5];
        int errors = 0 ;

        //test cases: Input values
        
        //testcase:1
        inputvalues[0]=8;
        expectedout[0]=3;
        
        //testcase:2
       inputvalues[1]=0;
        expectedout[1]=1;
        
        //testcase:3
        inputvalues[2]=5;
        expectedout[2]=3;
        
        //testcase:4
        inputvalues[3]=1;
        expectedout[3]=0;
        
        //testcase:5
        inputvalues[4]=8;
        expectedout[4]=3;


        for (int i=0; i<5; i++)
        {

            if(expectedout[i] != minimunReplacements(inputvalues[i]))
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







