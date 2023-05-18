//Ameer Ahmed

public class Str_Int {
    public static String intOrString(Object var) {

        if(var instanceof Integer) {
            return "int";
        }
        else if(var instanceof String) {
            return "str";
        }
        return "";
    }
    public static void main (String[] args) {
        System.out.println("" + intOrString(8));
        System.out.println("" + intOrString("Hello"));
        System.out.println("" + intOrString(9843532));
    }
}