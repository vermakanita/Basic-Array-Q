public class Min {
      
        public static void main(String[] args) {
            int arr[] = {2,4,7,9,5,1};
            int min = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<min){
               min= arr[i];
            }
            }
            System.out.println( min);
        }
     }
    
