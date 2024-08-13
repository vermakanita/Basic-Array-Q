public class checksort {
    public static void main(String[] args) {
        
        int arr[]= {1,2,3,4,5};
        int max = arr[0];
        boolean sort = true;
        for(int i = 0; i<arr.length-1;i++){
            if(max < arr[i+1]){
            //System.out.println("true");
            max = arr[i+1];
            }
            else{
            //System.out.println("false");
            sort = false;
            }
        }
        if(sort){
            System.out.println("array is sort");
        }else{
            System.out.println("aaray is not sort");
        }
    }   
}
