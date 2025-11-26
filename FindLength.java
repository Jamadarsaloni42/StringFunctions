public class FindLength {
    public static void lengthOfString(String s1,int count){
        for(int i=0;i<s1.length();i++){
          // s1.charAt(i);
           count++;
        }
        System.out.println(count);
    }
     public static void main(String args[]){
       String s1="Saloni Jamadar ";
      
       lengthOfString(s1, 0);

    }
}
