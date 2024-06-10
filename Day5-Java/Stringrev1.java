
public class Stringrev1 {
    public static void main(String[] args) {
        //using + (Concatination ) operator
        String str= "ABCD";
        String rev = "";
        int len = str.length();
        for(int i=len-1; i>=0 ; i--){
            rev = rev+ str.charAt(i);
        }
        System.out.println(rev);

    }
}
