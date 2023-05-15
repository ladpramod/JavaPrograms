public class FindMissingNumberFromArray {
    
    public static void main(String[] args) {
        
        int[] arr ={1,2,3,4,5,6,7,8,9,10,11,13};

        for(int i=1; i<13; i++){

            boolean isPresent = check(arr, i);
            if(isPresent==false){
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean check(int[] arr, int i) {

        for(int key=0; key<arr.length;key++){

            if(arr[key]==i){
                return true;
            }
        }

        return false;
    }
}
