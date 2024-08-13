public class ArraySorting {
//     public static void main(String[] args) {
//         int ar[]={1,5,3,6};
//           int a;
//         for(int i=0;i<ar.length;i++){
//             for(int j=0;j<ar.length-1;j++){
//                 if(ar[i]<ar[j]){
//                  a =ar[i];
//                 ar[i]=ar[j];
//                 ar[j]=a;
//                 }
//             }
//      }
//      for(int i=0;i<ar.length;i++)
//             {
//                 System.out.println(ar[i]);
//             }
//     }
// }








public static void main(String[] args) {
   int []num = {3,7,2,9,5,1,4,8,6} ;
    for(int i =0; i<num.length;i++){
        for(int j=0; j<num.length; j++){
            if(num[i]<num[j]){
                int tem = num[j];
                num[j]=num[i];
                num[i]=tem;
            }
        }
        
    }
    for(int i=0; i<num.length;i++){
        System.out.println(num[i]);
    }

}}