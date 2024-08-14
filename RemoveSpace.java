public class RemoveSpace {
    
    public static void main(String[] args) {
        String str ="this is a String";
        String newstr="";
        for(int i=0;i<str.length();i++){
           // char ch = str.charAt(i);
            if( str.charAt(i)!=' '){
             newstr = newstr+ str.charAt(i); }
            //System.out.println(ch);
        } str= newstr;
        System.out.println(str); 

    }
}
