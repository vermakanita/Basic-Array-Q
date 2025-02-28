public class prodesk {
    public static void main(String args[]){
        for(int i=1;i<=9;i+=2){
            // for(int s=1;s<i;s+=2){
            //     System.out.print(" ");
            // }
            //     for(int j =9; j>=i;j--){
            //         System.out.print("*");
            //     }
                
                for(int s=i;s<9;s+=2){
                    System.out.print(" ");
                }
                    for(int j =i; j>=1;j--){
                        System.out.print("*");
                    }

            
            System.out.println();
        }
    }
}

    

