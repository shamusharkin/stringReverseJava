public class ReverseString {
    String str;


    public ReverseString(String str) {
        System.out.println("ReverseString constructor");
        this.str = str;
    }

    public String getStr() {
        System.out.println("getStr " + str);
        return str;
    }

    public void reverseWithStringBuilder() {
        StringBuilder strBuilder = new StringBuilder(str.length());
        for (int i = (str.length() - 1); i >= 0; i--) {
            strBuilder.append(str.charAt(i));
        }
        System.out.println("reversed string " + strBuilder.toString());
        this.str = strBuilder.toString();
    }

    public void reverseWithStringBuilderReverse() {
        this.str = new StringBuilder(str).reverse().toString();
        System.out.println("reversed string " + this.str);

    }

    public static String reverseWithStaticMethod(String str) {
        //System.out.println("reversed string " + str);
        return new StringBuilder(str).reverse().toString();

    }
}
