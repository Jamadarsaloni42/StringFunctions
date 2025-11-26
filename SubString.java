public class SubString {
    public static String findSubstring(String s1,String s2,int beginindex,int endindex){
        for(int i=beginindex;i<endindex;i++){
            s2=s2+s1.charAt(i);
        }
        return s2;
    }

     public static void main(String args[]){
       String s1="saloni";
       String s2="";
       System.out.println(findSubstring(s1, s2,0,4));

    }
}
