public class FrequencyOfK
{
    //funtion return the Frequency of k in array
    static int returnFrequency(int []arr,int length,int k,int count){
        if(length<0){
            return count;
        }
  
            if(arr[length]==k){
                count++;
            }
             count=returnFrequency(arr,length-1,k,count);
             
        return count;
    }
	public static void main(String[] args) {
		int array[]={-1,2,4,1,-1,-1,3,4,-1};
		int k=2;
		int count=0;
		System.out.println("Frequency of k is "+ returnFrequency(array,array.length-1,k,count));
	}
}
