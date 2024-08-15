/**
 * IndexElement
 */
public class IndexElement {

    
    public static void main(String[] args) {
        int ar[]={3,7,2,9,5,1,8,4,6};
          for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(ar[i]<ar[j]){
                    int temp = ar[j];
                    ar[j]=ar[i];
                    ar[i]=temp;
                }
            }}
             
             System.out.println(ar[2]);


    }
}
