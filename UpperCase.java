public class UpperCase {
    public static String uppercaseString(String s1,String s2){
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch>='a' && ch<='z'){
              ch=(char) (ch-32);
            }
            s2=s2+ch;
        }
        return s2;
        
    }
 public static void main(String args[]){
       String s1="saloni";
       String s2="";
       System.out.println(uppercaseString(s1,s2));

    }


}
