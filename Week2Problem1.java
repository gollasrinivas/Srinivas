public class PrintValidParanthesis
{
  //a recursive function that print all the valid paranthesis
    static void printValidParanthesis(int leftParan,int rightparan, String ValidParanthesis)
    {
        if(leftParan==0 && rightparan==0){
            System.out.println(ValidParanthesis);
        }
        if(leftParan>rightparan){
            return;
        }
        if(leftParan>0){
            printValidParanthesis(leftParan-1,rightparan,ValidParanthesis+"(");
        }
        if(rightparan>0){
            printValidParanthesis(leftParan,rightparan-1,ValidParanthesis+")");
        }
    }
	public static void main(String[] args) {
	    int n=6;
		printValidParanthesis(n/2,n/2,"");
	}
}
//input: n=6
//output:((()))
//       (()())
//       ()(())
//       (())()
//       ()()()
