
public class ReplaceCharacter {
    public static String replaceCharacterFromString(char oldchar,char newchar,String s1, String s2){
        
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==oldchar) {
                s2=s2+newchar;
            }
            else{
                s2=s2+s1.charAt(i);
            }
        }
        return s2;
       
    }

    public static void main(String args[]){
       String s1="Bright";
       String s2="";
       System.out.println(replaceCharacterFromString('B','S',s1,s2));

    }


}
