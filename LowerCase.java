public class LowerCase {
      public static String lowercaseString(String s1,String s2){
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch>='A' && ch<='Z'){
              ch=(char) (ch+32);
            }
            s2=s2+ch;
        }
        return s2;
        
    }
 public static void main(String args[]){
       String s1="BRIGHT";
       String s2="";
       System.out.println(lowercaseString(s1,s2));

    }
}
