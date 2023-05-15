public class FindMaxMinNumberInArray {
    
    public static void main(String[] args) {
        
        int[] arr = {1,3,5,6,10};
        int min=1;
        int max=0;
        

        for(int i=0; i<arr.length; i++){

                if(arr[i]<min){

                    min = arr[i];
                }

                if(arr[i]> max){
                    max=arr[i];
                }
            
        }

        System.out.println("Min number: "+min + " Max number is: "+ max);
    }
}
