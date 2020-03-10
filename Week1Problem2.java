
import java.util.Scanner;

public class minimunFlipsRequire {

    //return the minimum number of flips required to flip to make a or b==c
    public static int minimunFlipsRequired(int tests[])
    {
       return Integer.bitCount((tests[0] | tests[1])^ tests[2]) + Integer.bitCount(tests[0]&tests[1]&(~tests[2]));
    }
    public static void main(String args[])
    {
        
        int inputvalues[][] = new int[5][3];
        int expectedout[] = new int[5];
        int errors = 0 ;

        //test cases: Input values
        
        //testcase:1
        inputvalues[0][0]=2;
        inputvalues[0][1]=6;
        inputvalues[0][2]=5;
        expectedout[0]=3;
        
        //testcase:2
        inputvalues[1][0]=0;
        inputvalues[1][1]=0;
        inputvalues[1][2]=0;
        expectedout[1]=0;
        
        //testcase:3
        inputvalues[2][0]=7;
        inputvalues[2][1]=0;
        inputvalues[2][2]=0;
        expectedout[2]=3;
        
        //testcase:4
        inputvalues[3][0]=0;
        inputvalues[3][1]=100;
        inputvalues[3][2]=100;
        expectedout[3]=0;
        
        //testcase:5
        inputvalues[4][0]=2;
        inputvalues[4][1]=6;
        inputvalues[4][2]=5;
        expectedout[4]=3;


        for (int i=0; i<5; i++)
        {

            if(expectedout[i] != minimunFlipsRequired(inputvalues[i]))
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






