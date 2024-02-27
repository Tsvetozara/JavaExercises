package others;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Lets dance";
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);
    }
}
